package cn.com.lc.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.com.lc.service.UserService;
import cn.com.lc.bean.*;

import com.opensymphony.xwork2.ActionContext;
public class UserAction extends ActionSupport {
	private UserService userService;
	private User user=new User();
	private String name;
	private String pass;
	private boolean flag;
	private int state; // 2 登陆成功  1登陆失败
	private int mid;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login(){
		this.user = this.userService.islogin(name, pass);
		if(this.user == null){
			this.state = 1;
		}
		else{
			this.state = 2;
			ActionContext.getContext().getSession().put("user", user);
		}
		// 3.1 session作用域保存数据
		return "success";
	}
	public String addmu(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		this.flag =this.userService.addMusic(user.getId(), mid);
		return "success";
	}
	public String delmu(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		this.userService.delMusic(user.getId(), mid);
		return "success";
	}
}
