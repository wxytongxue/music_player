package cn.com.lc.dao;

import cn.com.lc.bean.User;

public interface UserDao {
	public User query(String name,String pass);
	public void delMusic(int uid,int mid);
	public boolean addMusic(int uid,int mid);
}
