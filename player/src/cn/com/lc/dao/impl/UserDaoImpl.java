package cn.com.lc.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.com.lc.bean.Music;
import cn.com.lc.bean.User;
import cn.com.lc.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User query(String name, String pass) {
			List<User> users = this.getHibernateTemplate().find("from User u where u.username=? and u.password = ?", name,pass);
			if(users.size() == 1){
				return users.get(0);
			} 
			return null;
	}
	
	public void delMusic(int uid,int mid) {
		User user = this.getHibernateTemplate().get(User.class, uid);
		Music muisc = this.getHibernateTemplate().get(Music.class, mid);
		user.getMusics().remove(muisc);
		this.getHibernateTemplate().save(user);
	}
	
	public boolean addMusic(int uid,int mid) {
		User user = this.getHibernateTemplate().get(User.class, uid);
		Music muisc = this.getHibernateTemplate().get(Music.class, mid);
		boolean flag=user.getMusics().add(muisc);
		this.getHibernateTemplate().save(user);
		return flag;
	}
}
