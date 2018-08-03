package com.reqman.pojo;

// Generated 13 Aug, 2017 10:25:05 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Request generated by hbm2java
 */
@Entity
@Table(name = "request", uniqueConstraints = @UniqueConstraint(columnNames = {
		"projectid", "categoryid", "requesttypeid", "title" }))
public class Request implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7850920915635663322L;
	private int id;
	private Category category;
	private Project project;
	private Requesttype requesttype;
	private String title;
	private Integer projectid;
	private Integer categoryid;
	private Integer requesttypeid;
	private String description;
	private Date completiondate;
	private byte[] attachment;
	private Integer requeststatus;
	private Boolean status;
	private Date datecreated;
	private String createdby;
	private Date datemodified;
	private String modifiedby;
	private Requestworkflow requestworkflow;

	public Request() {
	}

	public Request(Category category, Project project, Requesttype requesttype) {
		this.category = category;
		this.project = project;
		this.requesttype = requesttype;
	}

	public Request(Category category, Project project, Requesttype requesttype,
			String title, Integer projectid, Integer categoryid,
			Integer requesttypeid, String description, Date completiondate,
			byte[] attachment, Integer requeststatus, Boolean status,
			Date datecreated, String createdby, Date datemodified,
			String modifiedby, Requestworkflow requestworkflow) {
		this.category = category;
		this.project = project;
		this.requesttype = requesttype;
		this.title = title;
		this.projectid = projectid;
		this.categoryid = categoryid;
		this.requesttypeid = requesttypeid;
		this.description = description;
		this.completiondate = completiondate;
		this.attachment = attachment;
		this.requeststatus = requeststatus;
		this.status = status;
		this.datecreated = datecreated;
		this.createdby = createdby;
		this.datemodified = datemodified;
		this.modifiedby = modifiedby;
		this.requestworkflow = requestworkflow;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "category"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Requesttype getRequesttype() {
		return this.requesttype;
	}

	public void setRequesttype(Requesttype requesttype) {
		this.requesttype = requesttype;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "projectid")
	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	@Column(name = "categoryid")
	public Integer getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Column(name = "requesttypeid")
	public Integer getRequesttypeid() {
		return this.requesttypeid;
	}

	public void setRequesttypeid(Integer requesttypeid) {
		this.requesttypeid = requesttypeid;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "completiondate", length = 29)
	public Date getCompletiondate() {
		return this.completiondate;
	}

	public void setCompletiondate(Date completiondate) {
		this.completiondate = completiondate;
	}

	@Column(name = "attachment")
	public byte[] getAttachment() {
		return this.attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	@Column(name = "requeststatus")
	public Integer getRequeststatus() {
		return this.requeststatus;
	}

	public void setRequeststatus(Integer requeststatus) {
		this.requeststatus = requeststatus;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datemodified", length = 29)
	public Date getDatemodified() {
		return this.datemodified;
	}

	public void setDatemodified(Date datemodified) {
		this.datemodified = datemodified;
	}

	@Column(name = "modifiedby", length = 50)
	public String getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "request")
	public Requestworkflow getRequestworkflow() {
		return this.requestworkflow;
	}

	public void setRequestworkflow(Requestworkflow requestworkflow) {
		this.requestworkflow = requestworkflow;
	}

}