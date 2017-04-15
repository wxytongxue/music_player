package cn.com.lc.bean;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import cn.com.lc.bean.Music;
//userTbl
public class User implements Serializable{
	private int id;
	private String username;
	private String password;
	//多对多关系
	private Set<Music> musics= new HashSet<Music>();
	//set和get
	public Set<Music> getMusics() {
		return musics;
	}
	public void setMusics(Set<Music> musics) {
		this.musics = musics;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "id:"+id+" username:"+username+" password:"+password;
	}
}






