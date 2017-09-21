package com.gtw.LinkSaver;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@EnableSwagger2
public class LinkSaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkSaverApplication.class, args);
	}

	@Bean
	public Docket linkSaverApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("spring-swagger-api")
				.apiInfo(apiInfo())
				.select()
				.paths(Predicates.not(regex("/error.*")))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("LinkSaver")
				.description("LinkSaver")
				.license("Apache License Version 2.0")
				.licenseUrl("LinkSaver")
				.version("1.0")
				.build();
	}
}
