
package com.demo.beneficiary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beneficiary.controller.service.FieldServiceImpl;
import com.demo.beneficiary.domain.beneficiary.fieldconfig.Field;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Rakesh.Nair
 *
 */
@RestController()
@Api(value = "/fields" , description = "List of API's pretaining to Field management service.")
public class FieldController {

	@Autowired
	private FieldServiceImpl fieldService;
	
	@GetMapping("/fields")
	@ApiOperation(value = "Retrieve list of all supported fields)", response = Field.class, responseContainer = "List")
	public List<Field> getAllFields() {
		return fieldService.getFields();
	}

	
	@PostMapping(path="/fields")
	@ApiOperation(value = "Adds a new field", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Field createField(@RequestBody Field field) {
		return fieldService.create(field);
	}
}
