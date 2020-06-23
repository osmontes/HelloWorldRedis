package es.leroymerlin.oms.stock.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public static Docket api() {

        ApiInfo apiInfo = new ApiInfo(
            "lmes-oms-stock-api",
            "Real Time Stock API",
            "1.0.0",
            "",
            new Contact("Leroy Merlin", "", ""),
            null,
            null,
            new ArrayList<>());

        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo)
            .select()
            .apis(RequestHandlerSelectors.basePackage("es.leroymerlin.oms.stock.api.controller"))
            .paths(PathSelectors.regex("/.*"))
            .build();
    }

}