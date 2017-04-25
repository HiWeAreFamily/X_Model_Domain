package org.dcc.domain.sys;

import java.util.Date;

public class SysUser {

	// 记录标识 id bigint pk, not null
	// 所属组织 to_id bigint fk, not null
	// 登录帐号 login_name varchar(64) not null
	// 用户密码 password varchar(64) not null
	// 用户姓名 vsername varchar(64) not null
	// 手机号 mobile varchar(20)
	// 电子邮箱 email varchar(64)
	// 创建时间 gen_time datetime not null
	// 登录时间 login_time datetime
	// 上次登录时间 last_login_time datetime
	// 登录次数 count bigint not null
	private int id;
	private String login_name;
	private String password;
	private String vsername;
	private int mobile;
	private String email;
	private Date gen_time;
	private Date login_time;
	private Date last_login_time;
	private int count;
	

	// private String online_duration;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVsername() {
		return vsername;
	}

	public void setVsername(String vsername) {
		this.vsername = vsername;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getGen_time() {
		return gen_time;
	}

	public void setGen_time(Date gen_time) {
		this.gen_time = gen_time;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public SysUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SysUser(int id, String login_name, String password, String vsername,
			int mobile, String email, Date gen_time, Date login_time,
			Date last_login_time, int count) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.password = password;
		this.vsername = vsername;
		this.mobile = mobile;
		this.email = email;
		this.gen_time = gen_time;
		this.login_time = login_time;
		this.last_login_time = last_login_time;
		this.count = count;
	}

}
