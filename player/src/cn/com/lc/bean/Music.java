package cn.com.lc.bean;

public class Music {
	int mid;
	String musicsinger;
	String musicname;
	String musicpath;
	
	public String getMusicpath() {
		return musicpath;
	}
	public void setMusicpath(String musicpath) {
		this.musicpath = musicpath;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMusicsinger() {
		return musicsinger;
	}
	public void setMusicsinger(String musicsinger) {
		this.musicsinger = musicsinger;
	}
	public String getMusicname() {
		return musicname;
	}
	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mid:"+mid +" musicsinger"+musicsinger+" musicname:"+musicname;
	}
}
