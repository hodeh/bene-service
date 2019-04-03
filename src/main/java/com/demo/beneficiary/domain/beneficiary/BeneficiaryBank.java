
package com.demo.beneficiary.domain.beneficiary;

import java.io.Serializable;

/**
 * @author Rakesh.Nair
 *
 */
public class BeneficiaryBank implements Serializable{

	private static final long serialVersionUID = 1L;
	private String bankId;
	private String name;
	private String branch;
	private String city;
	
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
