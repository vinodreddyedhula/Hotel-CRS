package com.crs.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer{
	
	    @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.ant("/api/v1/**"))                          
	          .build();                                           
	    }
	    
		/*
		 * @Bean public UiConfiguration uiConfig() { // TODO: improve headers when this
		 * is fixed: // https://github.com/swagger-api/swagger-ui/issues/4839 return
		 * UiConfigurationBuilder.builder().deepLinking(true).displayOperationId(false).
		 * defaultModelsExpandDepth(1)
		 * .defaultModelExpandDepth(1).defaultModelRendering(ModelRendering.EXAMPLE).
		 * displayRequestDuration(false)
		 * .docExpansion(DocExpansion.NONE).filter(false).maxDisplayedTags(null)
		 * .operationsSorter(OperationsSorter.ALPHA).showExtensions(false).tagsSorter(
		 * TagsSorter.ALPHA)
		 * .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS).
		 * validatorUrl(null).build(); }
		 */
}
