package cn.com.lc.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.com.lc.service.*;
import java.util.List;
import java.util.ArrayList;
import cn.com.lc.bean.*;
public class PlayerAction extends ActionSupport {
    private MusicService musicService;
    private List<Music> musics=new ArrayList<Music>();
    
    public List<Music> getMusics() {
		return musics;
	}
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
	/*
	public MusicService getMusicService() {
        return musicService;
    }*/
    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }
    
    @Override
    public String execute() throws Exception {
        this.musics = this.musicService.findall();
        return super.execute();
    }
}
