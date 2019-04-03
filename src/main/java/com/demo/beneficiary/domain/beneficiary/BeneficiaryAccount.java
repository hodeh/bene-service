package com.demo.beneficiary.domain.beneficiary;

import java.io.Serializable;

public class BeneficiaryAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	private String accountNumber;
	private String  accountType;
	private BeneficiaryBank bank;
	private String countryCode;

	public BeneficiaryAccount() {
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BeneficiaryBank getBank() {
		return bank;
	}

	public void setBank(BeneficiaryBank bank) {
		this.bank = bank;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}