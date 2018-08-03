package com.reqman.pojo;

// Generated 13 Aug, 2017 10:25:05 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Category implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5649240027780407111L;
	private int id;
	private String name;
	private Boolean status;
	private Date datecreated;
	private String createdby;
	private Request request;

	public Category() {
	}

	public Category(int id) {
		this.id = id;
	}

	public Category(int id, String name, Boolean status, Date datecreated,
			String createdby, Request request) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.datecreated = datecreated;
		this.createdby = createdby;
		this.request = request;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", unique = true, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datecreated", length = 29)
	public Date getDatecreated() {
		return this.datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	@Column(name = "createdby", length = 50)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "category")
	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

}