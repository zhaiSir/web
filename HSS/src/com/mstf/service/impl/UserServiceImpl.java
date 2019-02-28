package com.mstf.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mstf.bean.Info;
import com.mstf.bean.User;
import com.mstf.service.UserService;


public class UserServiceImpl implements UserService {
	
	//hibernate的SessionFactory对象由spring自动注入，入口为getSessionFactory方法
	private SessionFactory sessionFactory;
	
	@Override
	public User loginServce(User user) {
		//执行数据库查询
		String sql = "from User where username = ? and password = ?";
		@SuppressWarnings("unchecked")
		List<User> list = sessionFactory.getCurrentSession().createQuery(sql)
		.setString(0, user.getUsername())
		.setString(1, user.getPassword()).list();
		if(list != null && list.size() == 1){
			//返回结果
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		
	}
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")//-------------���?��Ļ���
		List<User> userlist=sessionFactory.getCurrentSession().createQuery(//
				"FROM User").list();
		return userlist;
	}
	
	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
		
	}
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
		
		
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
