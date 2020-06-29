package com.pucrs.grupo2.Recipes.controllers;

import com.pucrs.grupo2.Recipes.models.Receita;
import com.pucrs.grupo2.Recipes.services.ServicoReceitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private ServicoReceitas servicoReceitas;

    @GetMapping("/recipes")
    public List<Receita> todasReceitas() {

        return servicoReceitas.findAll();
    }

    @GetMapping("/recipes/count")
    public Long count() {

        return servicoReceitas.count();
    }

    @DeleteMapping("/recipes/{id}")
    public void delete(@PathVariable String id) {

        Long idReceita = Long.parseLong(id);
        servicoReceitas.deleteById(idReceita);
    }
}