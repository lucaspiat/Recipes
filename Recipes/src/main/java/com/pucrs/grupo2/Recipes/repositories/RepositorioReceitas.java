package com.pucrs.grupo2.Recipes.repositories;

import java.util.List;
//import java.util.Map;

import com.pucrs.grupo2.Recipes.models.Receita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;



public interface RepositorioReceitas extends CrudRepository<Receita, Long> {
    List<Receita> findByMatricula(long matricula);
    List<Receita> findAll();

    @Query (value = "SELECT * FROM receita", nativeQuery = true)
    List<Receita> findTables();

}
