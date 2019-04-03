package com.demo.beneficiary.domain.beneficiary.fieldconfig;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.beneficiary.domain.model.base.BaseModel;

@Entity
@Table(name = "BC_TRF_FIELDSMAPPING")
public class Form extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Field field;
	private String countryCode;
	private String transferType;
	private SponseringBank sponseringBank;

	@Id
	@GeneratedValue
	@Column(name = "FIELDSMAPPINGID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne()
	@JoinColumn(name = "FIELDID")
	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
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

	@ManyToOne()
	@JoinColumn(name = "BC_TRF_SPONSERINGBANK")
	public SponseringBank getSponseringBank() {
		return sponseringBank;
	}

	public void setSponseringBank(SponseringBank sponseringBank) {
		this.sponseringBank = sponseringBank;
	}
	
	
}
