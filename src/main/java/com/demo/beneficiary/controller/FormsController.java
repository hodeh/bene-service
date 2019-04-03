/**
 * 
 */
package com.demo.beneficiary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Form;
import com.demo.beneficiary.repository.beneficiary.fieldconfig.FormRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Rakesh.Nair
 *
 */
/**
 * @author Rakesh.Nair
 *
 */
@RestController()
@Api(value = "/forms" , description = "List of API's pretaining to form management service.")
public class FormsController {

	@Autowired
	private FormRepository repository;

	@GetMapping("/forms")
	@ApiOperation(value = "Retrieve list of forms", response = Form.class, responseContainer = "List")
	public List<Form> getFieldMapping(@RequestParam("countryCode") String countryCode,
			@RequestParam("transferType") String transferType) {
		return repository.findByCountryCodeAndTransferType(countryCode, transferType);
	}
	
	@PostMapping(path = "/forms")
	@ApiOperation(value = "Adds a new form", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Form createField(@RequestBody Form form) {
		return repository.save(form);
	}
}
