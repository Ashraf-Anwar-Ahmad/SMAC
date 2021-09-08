package com.icg.smac.entities;

import java.util.Date;

import javax.persistence.Entity;

public class Contract {
	
	private String contractId;
	private String vendorId;
	private int isActive;
	private String contractRef;
	private Date contractDt;
	private String fileNo;
	private String contractAuth;
	//private Blob contractDocs;
	private int contractExtionsion;

}
