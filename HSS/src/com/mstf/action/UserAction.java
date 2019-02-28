package com.mstf.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.mstf.bean.Info;
import com.mstf.bean.User;
import com.mstf.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	//用于ModelDriven填充对象,入口为getModel方法
	private User user;
	//用于spring自动注入，入口为setUserService方法
	private UserService userService;

	private static final long serialVersionUID = 1L;

	//方法名对应login_*.action中的*通配符
	public String login(){
		//调用service方法，返回从数据库取出的数据
		User returnUser = userService.loginServce(user);
		if(returnUser != null){
			//获取当前request对象
			HttpServletRequest request = ServletActionContext.getRequest();
			//将对象装入session
			request.getSession().setAttribute("User", user);
			//返回视图
			return SUCCESS;
		}
		return ERROR;
	}
	
	public UserService getUserService(){
		return userService;
	}
	public void setUserService(UserService userService){
		this.userService = userService;
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}
	
	public String addRegistUI() throws Exception{
		return "addRegistUI";
	}
	
	public String manage() throws Exception{
		//调用service方法，返回从数据库取出的数据
				List<User> userlist = userService.getUserList();
					//获取当前request对象
					HttpServletRequest request = ServletActionContext.getRequest();
					//将对象装入session
					request.getSession().setAttribute("userlist", userlist);
					//返回视图
		return "manage";
	}
	
	public String add() throws Exception{
		userService.save(user);
		return "toIndex";		
	}
	
	public String update() throws Exception{
		System.out.println("id"+user.getUser_id());
		User users=userService.getById(user.getUser_id());
		users.setUsername(user.getUsername());
		users.setAge(user.getAge());
		users.setPassword(user.getPassword());
		userService.update(users);
		return "success";		
	}
	
	public String editUi() throws Exception{
		User userL=userService.getById(user.getUser_id());
		//获取当前request对象
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("userL", userL);
		
		return "editUi";
	}
}
