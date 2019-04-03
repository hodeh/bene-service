/**
 * 
 */
package com.demo.beneficiary.repository.beneficiary;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.beneficiary.domain.beneficiary.Beneficiary;

/**
 * @author Rakesh.Nair
 *
 */
public interface BeneficiaryRepository extends MongoRepository<Beneficiary, String> {

	List<Beneficiary> findByCustomerNumber(String customerNumber);
}
