package com.demo.beneficiary;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.demo.beneficiary.domain.beneficiary.fieldconfig.Field;
import com.demo.beneficiary.domain.beneficiary.fieldconfig.FieldType;
import com.demo.beneficiary.repository.beneficiary.fieldconfig.FieldRepository;

@SpringBootApplication
@EntityScan(basePackages = { "com.demo.beneficiary.domain.beneficiary" })
public class BeneficiaryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficiaryServicesApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(FieldRepository repository) {
		return (args) -> {
			System.out.println("### --- Loading Field data in DB --- ###");

			Field f1 = new Field();
			f1.setFieldNameInEnglish("Bank IFSC code");
			f1.setCreatedAt(new Date());
			f1.setFieldType(FieldType.TextBox);
			f1.setMandatory(true);
			f1.setScreen("BENEFICIARY");
			f1.setStatus("Active");
			f1.setUpdatedAt(new Date());
			repository.save(f1);
			System.out.println("### --- Loaded 1 Field data in DB --- ###");

			Field f2 = new Field();
			f2.setFieldNameInEnglish("Bank Name");
			f2.setCreatedAt(new Date());
			f2.setFieldType(FieldType.TextBox);
			f2.setMandatory(true);
			f2.setScreen("BENEFICIARY");
			f2.setStatus("Active");
			f2.setUpdatedAt(new Date());
			repository.save(f2);
			System.out.println("### --- Loaded 2 Field data in DB --- ###");

			Field f3 = new Field();
			f3.setFieldNameInEnglish("Bank Custome Field");
			f3.setCreatedAt(new Date());
			f3.setFieldType(FieldType.TextBox);
			f3.setMandatory(true);
			f3.setScreen("BENEFICIARY");
			f3.setStatus("Active");
			f3.setUpdatedAt(new Date());
			repository.save(f3);
			System.out.println("### --- Loaded 3 Field data in DB --- ###");
		};
	}
}
