package com.icg.smac.bean;

public class TechnicianBean {

	private String USERTYPE;
	private String USERID;
	private String PASSWORD;
	public String getUSERTYPE() {
		return USERTYPE;
	}
	public void setUSERTYPE(String uSERTYPE) {
		USERTYPE = uSERTYPE;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	@Override
	public String toString() {
		return "TechnicianBean [USERTYPE=" + USERTYPE + ", USERID=" + USERID + ", PASSWORD=" + PASSWORD + "]";
	}
	public TechnicianBean(String uSERTYPE, String uSERID, String pASSWORD) {
		super();
		USERTYPE = uSERTYPE;
		USERID = uSERID;
		PASSWORD = pASSWORD;
	}
	public TechnicianBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
