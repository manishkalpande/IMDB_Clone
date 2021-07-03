package com.main.beans;


import java.io.InputStream;
import java.sql.Date;


import org.springframework.web.multipart.MultipartFile;

public class User 
{
	private String userid;
	private String uid;
	private String usernm;
	private Date dob;
	private String gen;
	private String mob;
	private String email;
	private String country;
	private String password;
//	private MultipartFile file;
	
	
	public User()
	{
		userid="";
		uid="";
		usernm="";
		dob=null;
		gen="";
		mob="";
		email="";
		country="";
		password="";
//		file=null;
		
	}

	public String getUserid() {
		PasswordHashing pws=new PasswordHashing();	
		return pws.doHashing(userid);
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUid() {
		return userid;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		PasswordHashing pass=new PasswordHashing();
		return pass.doHashing(password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public MultipartFile getFile() {
//		return file;
//	}
//
//	public void setFile(MultipartFile file){ 	
//		
//		this.file = file;
//		
//	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", usernm=" + usernm + ", dob=" + dob + ", gen=" + gen + ", mob=" + mob
				+ ", email=" + email + ", country=" + country + ", password=" + password + "]";
	}
	
	
	
}
