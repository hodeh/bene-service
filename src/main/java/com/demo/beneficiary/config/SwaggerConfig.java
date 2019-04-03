package com.demo.beneficiary.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Rakesh.Nair
 *
 */

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig {
	
	@Bean
	public Docket produceApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.demo.beneficiary.controller")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Beneficiary Management Rest APIs")
				.description("This page lists all the rest apis for Beneficiary Management.").version("1.0-SNAPSHOT")
				.build();
	}

	private Predicate<String> paths() {
		return Predicates.and(PathSelectors.regex("/beneficiaries.*"), Predicates.not(PathSelectors.regex("/error.*")));
	}
}
