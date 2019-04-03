package com.demo.beneficiary.repository.beneficiary.fieldconfig;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Field;

/**
 * @author Rakesh.Nair
 *
 */
public interface FieldRepository extends JpaRepository<Field, String> {

}
