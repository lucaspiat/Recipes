package com.pucrs.grupo2.Recipes.services;

import com.pucrs.grupo2.Recipes.models.Receita;
import com.pucrs.grupo2.Recipes.repositories.RepositorioReceitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoReceitas {

    @Autowired
    private RepositorioReceitas repositorioReceitas;

    public List<Receita> findAll() {

        var it = repositorioReceitas.findAll();

        var receitas = new ArrayList<Receita>();
        it.forEach(e -> receitas.add(e));

        return receitas;

    }

    public Long count() {

        return repositorioReceitas.count();
    }

    public void deleteById(Long idReceita) {

        repositorioReceitas.deleteById(idReceita);
    }
    
}