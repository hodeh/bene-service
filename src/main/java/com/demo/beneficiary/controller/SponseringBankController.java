/**
 * 
 */
package com.demo.beneficiary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Form;
import com.demo.beneficiary.domain.beneficiary.fieldconfig.SponseringBank;
import com.demo.beneficiary.repository.beneficiary.fieldconfig.FormRepository;
import com.demo.beneficiary.repository.beneficiary.fieldconfig.SponseringBankRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Rakesh.Nair
 *
 */
@RestController()
@Api(value = "/sponsering-banks", description = "List of API's pretaining to sponsering bank onboarding service.")
public class SponseringBankController {

	@Autowired
	private SponseringBankRepository repository;

	@Autowired
	private FormRepository formRepository;

	@GetMapping("/sponsering-banks")
	@ApiOperation(value = "Retrieve list of sponsering banks", response = SponseringBank.class, responseContainer = "List")
	public List<SponseringBank> get(@RequestParam("countryCode") String countryCode,
			@RequestParam("transferType") String transferType) {
		return repository.findByCountryCodeAndTransferType(countryCode, transferType);
	}

	@GetMapping("/sponsering-banks/{id}/forms")
	@ApiOperation(value = "Retrieve list of sponsering bank's forms.", response = SponseringBank.class, responseContainer = "List")
	public List<Form> getForms(@PathVariable("id") Long id) {
		return formRepository.findBySponseringBankId(id);
	}

	@PostMapping(path = "/sponsering-banks")
	@ApiOperation(value = "Add/Onboard a new sponsering bank", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public SponseringBank create(@RequestBody SponseringBank bank) {
		return repository.save(bank);
	}
}
