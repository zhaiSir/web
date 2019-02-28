package com.mstf.service;

import java.util.List;

import com.mstf.bean.User;

public interface UserService {
	public User loginServce(User user);
	
	public void save(User user);
	
	public User getById(Integer id);
	
	public List<User> getUserList();
	
	public void update(User user);
}
