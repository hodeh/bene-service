/**
 * 
 */
package com.demo.beneficiary.repository.beneficiary.fieldconfig;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.SponseringBank;

/**
 * @author Rakesh.Nair
 *
 */
public interface SponseringBankRepository extends JpaRepository<SponseringBank, String> {

	List<SponseringBank> findByCountryCodeAndTransferType(String countryCode, String transferType);
}
