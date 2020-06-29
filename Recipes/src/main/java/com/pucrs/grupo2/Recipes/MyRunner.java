package com.pucrs.grupo2.Recipes;

import com.pucrs.grupo2.Recipes.models.Receita;
import com.pucrs.grupo2.Recipes.repositories.RepositorioReceitas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;

import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
   
    @Autowired
    private RepositorioReceitas repositorioReceitas;
    /*private ConfigurableApplicationContext context;*/

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing recipes");

        var u1 = new Receita(1, "Negrinho");
        repositorioReceitas.save(u1);

        var u2 = new Receita(2, "Pastel");
        repositorioReceitas.save(u2);

        var u3 = new Receita(3, "Torta");
        repositorioReceitas.save(u3);

        /*System.exit(SpringApplication.exit(context));*/

        /*logger.info("stopped recipes");*/

        
    }
}