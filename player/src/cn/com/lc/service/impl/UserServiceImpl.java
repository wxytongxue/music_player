package cn.com.lc.service.impl;

import cn.com.lc.bean.User;
import cn.com.lc.dao.UserDao;
import cn.com.lc.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User islogin(String name, String pass) {
		User user = this.userDao.query(name, pass);
		return user;
	}

	@Override
	public boolean addMusic(int uid, int mid) {
		return this.userDao.addMusic(uid,mid);
	}

	@Override
	public void delMusic(int uid, int mid) {
		this.userDao.delMusic(uid,mid);
	}

}
