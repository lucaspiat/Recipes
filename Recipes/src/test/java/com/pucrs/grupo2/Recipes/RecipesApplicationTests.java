package com.pucrs.grupo2.Recipes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.pucrs.grupo2.Recipes.interfaces.ClienteFachadaRemota;


import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes=com.pucrs.grupo2.Recipes.App.class)
class RecipesApplicationTests {
	@Autowired
	private ClienteFachadaRemota controller;
	//private RepositorioReceitas repo;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
    
}
