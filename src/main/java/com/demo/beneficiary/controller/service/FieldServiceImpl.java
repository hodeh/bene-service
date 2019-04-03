package com.demo.beneficiary.controller.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Field;
import com.demo.beneficiary.repository.beneficiary.fieldconfig.FieldRepository;

@Service
public class FieldServiceImpl {

	@Autowired
	private FieldRepository repository;

	@Transactional
	public Field create(Field f) {
		f.setCreatedAt(new Date());
		f.setUpdatedAt(new Date());
		return repository.save(f);
	}
	
	@Transactional
	public List<Field> getFields() {
		return repository.findAll();
	}
}
