package com.icg.smac.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;
import javax.persistence.Table;


@NamedStoredProcedureQuery(

		name = "Login123456",

		procedureName = "PR_GET_AUTH",

		parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "USERTYPE"),

				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "USERID"),

				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "PASSWORD"),

				@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "P_RESULT"),

				@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class, name = "P_Out_Record")

				//@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "P_MESSAGE")

				//@StoredProcedureParameter(mode = ParameterMode.OUT, type = Date.class, name = "UPDATED_ON"),
				
				//@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "ORG")

		}

		)
@Entity
@Table(name="TECHNICIAN_ACCOUNT")
public class TechnicianAccount {

	@Id
	@Column(name="TECH_ID")
	private String techId;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PWD")
	private String userPwd;

	@Column(name="CREATED_DT")
	private Date createdDt;

	@Column(name="UPDATED_ON")
	private Date updatedOn;

	@Column(name="ORG")
	private String org;
	public TechnicianAccount(String techId, String userName, String userPwd, Date createdDt, Date updatedOn,
			String org) {
		super();
		this.techId = techId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.createdDt = createdDt;
		this.updatedOn = updatedOn;
		this.org = org;
	}
	public TechnicianAccount() {
		super();
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Date getcreatedDt() {
		return createdDt;
	}
	public void setcreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	@Override
	public String toString() {
		return "TechnicianAccount [techId=" + techId + ", userName=" + userName + ", userPwd=" + userPwd
				+ ", createdDt=" + createdDt + ", updatedOn=" + updatedOn + ", org=" + org + "]";
	}

}
