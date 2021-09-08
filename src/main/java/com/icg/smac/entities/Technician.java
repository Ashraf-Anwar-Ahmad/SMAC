package com.icg.smac.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.Table;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;


@Entity
@Table(name="TECHNICIAN")

@NamedStoredProcedureQueries({
@NamedStoredProcedureQuery(

name = "Login",

procedureName = "PR_GET_AUTH",
//resultClasses = Technician.class,

parameters = {

@StoredProcedureParameter(mode = ParameterMode.IN, name = "USERTYPE",type = String.class),

@StoredProcedureParameter(mode = ParameterMode.IN, name = "USERID",type = String.class),

@StoredProcedureParameter(mode = ParameterMode.IN,name = "PASSWORD" ,type = String.class),

@StoredProcedureParameter(mode = ParameterMode.OUT, name = "P_RESULT",type = String.class),

@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR,name = "P_Out_Record",type= void.class),

//@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "P_MESSAGE")
})})

public class Technician  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 482122568360961528L;
	
	@Id
	private String TECH_ID;
	@Column (name="FIRSTNAME")
	private String FIRSTNAME;
	@Column (name="LASTNAME")
	private String LASTNAME;
	@Column (name="GENDER")
	private String GENDER;
	@Column (name="MOBILE_NO")
    private int MOBILE_NO;
	@Column (name="OFFICIAL_EMAIL")
	private String OFFICIAL_EMAIL;
	@Column (name="PERSONAL_EMAIL")
	private String PERSONAL_EMAIL;
	@Column (name="PANNO")
	private String PANNO;
	@Column (name="DESIG")
	private String DESIG;
	@Column (name="CITY")
	private String CITY;
	@Column (name="STATE")
	private String STATE;
	@Column(name="PAN_NO")
	private String PAN_NO;
	@Column (name="ADHAAR_NO")
	private String ADHAAR_NO;
	@Column (name="IS_ACTIVE")
	private int IS_ACTIVE;
	@Column (name="ORG")
	private String ORG;
	
	private String Message;

	public Technician() {
		super();
	}

	public Technician(String tECH_ID, String fIRSTNAME, String lASTNAME, String gENDER, int mOBILE_NO,
			String oFFICIAL_EMAIL, String pERSONAL_EMAIL, String pANNO, String dESIG, String cITY, String sTATE,
			String pAN_NO, String aDHAAR_NO, int iS_ACTIVE, String oRG, String message) {
		super();
		TECH_ID = tECH_ID;
		FIRSTNAME = fIRSTNAME;
		LASTNAME = lASTNAME;
		GENDER = gENDER;
		MOBILE_NO = mOBILE_NO;
		OFFICIAL_EMAIL = oFFICIAL_EMAIL;
		PERSONAL_EMAIL = pERSONAL_EMAIL;
		PANNO = pANNO;
		DESIG = dESIG;
		CITY = cITY;
		STATE = sTATE;
		PAN_NO = pAN_NO;
		ADHAAR_NO = aDHAAR_NO;
		IS_ACTIVE = iS_ACTIVE;
		ORG = oRG;
		Message = message;
	}

	public String getTECH_ID() {
		return TECH_ID;
	}

	public void setTECH_ID(String tECH_ID) {
		TECH_ID = tECH_ID;
	}

	public String getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

	public String getLASTNAME() {
		return LASTNAME;
	}

	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public int getMOBILE_NO() {
		return MOBILE_NO;
	}

	public void setMOBILE_NO(int mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}

	public String getOFFICIAL_EMAIL() {
		return OFFICIAL_EMAIL;
	}

	public void setOFFICIAL_EMAIL(String oFFICIAL_EMAIL) {
		OFFICIAL_EMAIL = oFFICIAL_EMAIL;
	}

	public String getPERSONAL_EMAIL() {
		return PERSONAL_EMAIL;
	}

	public void setPERSONAL_EMAIL(String pERSONAL_EMAIL) {
		PERSONAL_EMAIL = pERSONAL_EMAIL;
	}

	public String getPANNO() {
		return PANNO;
	}

	public void setPANNO(String pANNO) {
		PANNO = pANNO;
	}

	public String getDESIG() {
		return DESIG;
	}

	public void setDESIG(String dESIG) {
		DESIG = dESIG;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}

	public String getPAN_NO() {
		return PAN_NO;
	}

	public void setPAN_NO(String pAN_NO) {
		PAN_NO = pAN_NO;
	}

	public String getADHAAR_NO() {
		return ADHAAR_NO;
	}

	public void setADHAAR_NO(String aDHAAR_NO) {
		ADHAAR_NO = aDHAAR_NO;
	}

	public int getIS_ACTIVE() {
		return IS_ACTIVE;
	}

	public void setIS_ACTIVE(int iS_ACTIVE) {
		IS_ACTIVE = iS_ACTIVE;
	}

	public String getORG() {
		return ORG;
	}

	public void setORG(String oRG) {
		ORG = oRG;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Technician [TECH_ID=" + TECH_ID + ", FIRSTNAME=" + FIRSTNAME + ", LASTNAME=" + LASTNAME + ", GENDER="
				+ GENDER + ", MOBILE_NO=" + MOBILE_NO + ", OFFICIAL_EMAIL=" + OFFICIAL_EMAIL + ", PERSONAL_EMAIL="
				+ PERSONAL_EMAIL + ", PANNO=" + PANNO + ", DESIG=" + DESIG + ", CITY=" + CITY + ", STATE=" + STATE
				+ ", PAN_NO=" + PAN_NO + ", ADHAAR_NO=" + ADHAAR_NO + ", IS_ACTIVE=" + IS_ACTIVE + ", ORG=" + ORG
				+ ", Message=" + Message + "]";
	}
	
}	