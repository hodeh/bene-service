package com.demo.beneficiary.domain.beneficiary.fieldconfig;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.beneficiary.domain.model.base.BaseModel;

@Entity
@Table(name = "BC_TRF_SPONSERINGBANK")
public class SponseringBank extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String countryCode;
	private String transferType;

	@Id
	@GeneratedValue
	@Column(name = "SPONSERINGBANKID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "COUNTRYCODE")
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "TFR_TYPE")
	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
}
