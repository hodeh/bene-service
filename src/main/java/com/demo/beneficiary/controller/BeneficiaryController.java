package com.demo.beneficiary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beneficiary.domain.beneficiary.Beneficiary;
import com.demo.beneficiary.repository.beneficiary.BeneficiaryRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Rakesh.Nair
 *
 */
@RestController()
@Api(value = "/beneficiaries", description = "List of API's pretaining to beneficiary in beneficiary management service.")
public class BeneficiaryController {

	@Autowired
	private BeneficiaryRepository repository;

	@GetMapping("/beneficiaries")
	@ApiOperation(value = "Retrieve list of beneficiaries belonging to a customer (remitter)", response = Beneficiary.class, responseContainer = "List")
	public List<Beneficiary> getBeneficiary(@RequestParam("customerNumber") String customerNumber) {
		return repository.findByCustomerNumber(customerNumber);
	}

	/*@PostMapping(path="/beneficiaries", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add beneficiary to a customer (remitter)", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Beneficiary saveBeneficiary(@RequestBody Beneficiary bene) {
		return repository.insert(bene);
	}*/

//	@GetMapping("/beneficiaries/greet")
//	public String greet(@RequestHeader("Authorization") String authHeader) {
//		final String token = authHeader.substring(7); // The part after "Bearer "
//	    final Claims claims =
//	        Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
//		return claims.toString();
//	}
	
	@PostMapping(path="/beneficiaries")
	@ApiOperation(value = "Add beneficiary to a customer (remitter)", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Beneficiary createBeneficiary(@RequestBody Beneficiary bene) {
		return repository.insert(bene);
	}
}