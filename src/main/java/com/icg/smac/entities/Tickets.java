package com.icg.smac.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TICKETS")
public class Tickets {
	
	@Id
	@Column(name="TICKET_STATUS")
	private String ticketStatus;
	
	@Column(name="EQPT_SUBTYPE")
	private String eqptSubtype;
	
	@Column(name="PID")
	private String pId;
	
	@Column(name="EQPT_TYPE")
	private String eqptType;
	
	@Column(name="IS_ACTIVE")
	private int isActive;
	
	@Column(name="CREATED_DT")
	private Date createdDt;
	
	@Column(name="CLOSED_DT")
	private Date closedDt;
	
	@Column(name="TICKET_ID")
	private String ticketId;
	
	@Column(name="EQPT_ID")
	private String eqptId;
	
	@Column(name="DESCR")
	private String descr;

	public Tickets(String ticketStatus, String eqptSubtype, String pId, String eqptType, int isActive, Date createdDt,
			Date closedDt, String ticketId, String eqptId, String descr) {
		super();
		this.ticketStatus = ticketStatus;
		this.eqptSubtype = eqptSubtype;
		this.pId = pId;
		this.eqptType = eqptType;
		this.isActive = isActive;
		this.createdDt = createdDt;
		this.closedDt = closedDt;
		this.ticketId = ticketId;
		this.eqptId = eqptId;
		this.descr = descr;
	}

	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getEqptSubtype() {
		return eqptSubtype;
	}

	public void setEqptSubtype(String eqptSubtype) {
		this.eqptSubtype = eqptSubtype;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getEqptType() {
		return eqptType;
	}

	public void setEqptType(String eqptType) {
		this.eqptType = eqptType;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getClosedDt() {
		return closedDt;
	}

	public void setClosedDt(Date closedDt) {
		this.closedDt = closedDt;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getEqptId() {
		return eqptId;
	}

	public void setEqptId(String eqptId) {
		this.eqptId = eqptId;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "Tickets [ticketStatus=" + ticketStatus + ", eqptSubtype=" + eqptSubtype + ", pId=" + pId + ", eqptType="
				+ eqptType + ", isActive=" + isActive + ", createdDt=" + createdDt + ", closedDt=" + closedDt
				+ ", ticketId=" + ticketId + ", eqptId=" + eqptId + ", descr=" + descr + "]";
	}
	

}
