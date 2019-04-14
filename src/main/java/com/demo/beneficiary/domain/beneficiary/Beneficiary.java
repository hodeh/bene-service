package com.demo.beneficiary.domain.beneficiary;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "beneficiaries")
public class Beneficiary implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String referenceNumber;
	private String beneficiaryId;
	private BeneficiaryType beneficiaryType;
	private String customerNumber;
	private Boolean expressTransferEnabled;
	private BeneficiaryPerson person;
	private BeneficiaryAccount account;
	private Date activeDate;
	private String transferType;
	private Map<String, Object> customFields;
	private String fieldMappingId;
	private String newField;
	
	public String getNewField() {
	return newField;
	}
	
	public void setNewField(String newField){
	this.newField = newField;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public BeneficiaryType getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(BeneficiaryType beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Boolean getExpressTransferEnabled() {
		return expressTransferEnabled;
	}

	public void setExpressTransferEnabled(Boolean expressTransferEnabled) {
		this.expressTransferEnabled = expressTransferEnabled;
	}

	public BeneficiaryPerson getPerson() {
		return person;
	}

	public void setPerson(BeneficiaryPerson person) {
		this.person = person;
	}

	public BeneficiaryAccount getAccount() {
		return account;
	}

	public void setAccount(BeneficiaryAccount account) {
		this.account = account;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public Map<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	}

	public String getFieldMappingId() {
		return fieldMappingId;
	}

	public void setFieldMappingId(String fieldMappingId) {
		this.fieldMappingId = fieldMappingId;
	}
}
