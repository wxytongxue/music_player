package cn.com.lc.service.impl;

import java.util.List;
import cn.com.lc.dao.MusicDao;
import cn.com.lc.bean.Music;
import cn.com.lc.service.MusicService;

public class MusicServiceImpl implements MusicService {
	
	private MusicDao musicDao;
	
	public MusicDao getMusicDao() {
		return musicDao;
	}
	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
	}



	@Override
	public List<Music> findall() {
		return this.musicDao.findall();
	}

}
