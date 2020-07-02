package com.pucrs.grupo2.Recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
   
        

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing recipes");

        

        
    }
}