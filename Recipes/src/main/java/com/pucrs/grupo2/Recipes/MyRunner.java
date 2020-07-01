package com.pucrs.grupo2.Recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//import com.pucrs.grupo2.Recipes.repositories.RepositorioReceitas;
import javax.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
   
    //@Autowired
    //private RepositorioReceitas repositorioReceitas;
    

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing recipes");

        

        
    }
}