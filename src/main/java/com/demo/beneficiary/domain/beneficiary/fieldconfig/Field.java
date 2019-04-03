package com.demo.beneficiary.domain.beneficiary.fieldconfig;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.beneficiary.domain.model.base.BaseModel;

@Entity
@Table(name="BC_TRF_FIELDS")
public class Field extends BaseModel {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String fieldNameInArabic;
	private String fieldNameInEnglish;
	private boolean mandatory;
	private FieldType fieldType;
	private String maxLength;
	private boolean date;
	private boolean numeric;
	private String screen;

	@Id
	@GeneratedValue
	@Column(name="FIELDID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="FIELD_ARB")
	public String getFieldNameInArabic() {
		return fieldNameInArabic;
	}

	public void setFieldNameInArabic(String fieldNameInArabic) {
		this.fieldNameInArabic = fieldNameInArabic;
	}

	@Column(name="FIELD_ENG")
	public String getFieldNameInEnglish() {
		return fieldNameInEnglish;
	}

	public void setFieldNameInEnglish(String fieldNameInEnglish) {
		this.fieldNameInEnglish = fieldNameInEnglish;
	}

	@Column(name="MANDATORY_FIELD")
	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	@Column(name="FIELDTYPE")
	public FieldType getFieldType() {
		return fieldType;
	}

	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}

	@Column(name="MAXLENGTH")
	public String getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}

	@Column(name="ISDATE")
	public boolean isDate() {
		return date;
	}

	public void setDate(boolean date) {
		this.date = date;
	}

	@Column(name="ISNUMERIC")
	public boolean isNumeric() {
		return numeric;
	}

	public void setNumeric(boolean numeric) {
		this.numeric = numeric;
	}

	@Column(name="SCREEN")
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}
}
