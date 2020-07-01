package com.pucrs.grupo2.Recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*import org.springframework.context.ConfigurableApplicationContext;*/

@SpringBootApplication
@ComponentScan(basePackages = "com.pucrs.grupo2")
@EnableJpaRepositories(basePackages = {"com.pucrs.grupo2"}) // onde procurar as interfaces dos repositórios do JPA
@EntityScan(basePackages = {"com.pucrs.grupo2"}) // onde procurar as entidades
public class App {

    public static void main(String[] args) {
        /*ConfigurableApplicationContext context = */
        SpringApplication.run(App.class, args);

        /*context.close();*/
    }
}