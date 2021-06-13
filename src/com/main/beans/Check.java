package com.main.beans;

public class Check {
	private String uid;
	private String pswd;
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the pswd
	 */
	public String getPswd() {
		return pswd;
	}
	/**
	 * @param pswd the pswd to set
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	public Check() {
		System.out.println("check bean");
	}
}
