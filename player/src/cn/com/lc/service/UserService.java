package cn.com.lc.service;

import cn.com.lc.bean.User;

public interface UserService {
	public User islogin(String name,String pass);
	public boolean addMusic(int uid,int mid);
	public void delMusic(int uid,int mid);

}
