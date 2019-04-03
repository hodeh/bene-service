package com.demo.beneficiary.domain.beneficiary;

import java.io.Serializable;

/**
 * @author Rakesh.Nair
 *
 */
public class BeneficiaryType implements Serializable {

	private static final long serialVersionUID = 1L;
	private String type;
	private int code;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
