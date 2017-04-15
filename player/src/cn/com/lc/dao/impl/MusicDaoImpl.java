package cn.com.lc.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.com.lc.bean.Music;
import cn.com.lc.bean.User;
import cn.com.lc.dao.MusicDao;

public class MusicDaoImpl extends HibernateDaoSupport implements MusicDao {

	@Override
	public List<Music> findall() {
		List<Music> musics = this.getHibernateTemplate().find("from Music u");
		return musics;
	}

}
