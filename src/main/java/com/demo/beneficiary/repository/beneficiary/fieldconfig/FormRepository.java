package com.demo.beneficiary.repository.beneficiary.fieldconfig;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Form;

/**
 * @author Rakesh.Nair
 *
 */
/**
 * @author Rakesh.Nair
 *
 */
public interface FormRepository extends JpaRepository<Form, String> {

	List<Form> findByCountryCodeAndTransferType(String countryCode, String transferType);

	List<Form> findBySponseringBankId(Long sponseringBankId);
}
