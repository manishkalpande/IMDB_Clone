package com.main.beans;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import javax.servlet.http.Part;

public class User 
{
	private String userid;
	private String usernm;
	private Date dob;
	private String gen;
	private String mob;
	private String email;
	private String country;
	private String password;
	private InputStream file;
	
	
	public User()
	{
		userid="";
		usernm="";
		dob=null;
		gen="";
		mob="";
		email="";
		country="";
		password="";
		file=null;
		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		PasswordHashing pws=new PasswordHashing();
		this.userid = pws.doHashing(userid);
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
		return password;
	}

	public void setPassword(String password) {
		PasswordHashing pws=new PasswordHashing();
		this.password = pws.doHashing(password);;
	}

	public InputStream getFile() {
		return file;
	}

	public void setFile(Part file) throws IOException {
		
		this.file = file.getInputStream();
		
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", usernm=" + usernm + ", dob=" + dob + ", gen=" + gen + ", mob=" + mob
				+ ", email=" + email + ", country=" + country + ", password=" + password + ", file=" + file + "]";
	}
	
	
	
}
