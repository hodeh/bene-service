/**
 * 
 */
package com.demo.beneficiary.domain.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


/**
 * @author Rakesh.Nair
 *
 */
@MappedSuperclass
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date createdAt;
	private Date updatedAt;
	private String status;

	@Column(name="INSERT_DATE")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name="UPDATE_DATE")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name="STATUS")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
