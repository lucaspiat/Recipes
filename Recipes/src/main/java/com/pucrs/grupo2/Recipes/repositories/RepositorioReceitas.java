package com.pucrs.grupo2.Recipes.repositories;

import java.util.List;

import com.pucrs.grupo2.Recipes.models.Receita;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioReceitas extends CrudRepository<Receita, Long>{
    List<Receita> findById(long id);
    List<Receita> findAll();
}
