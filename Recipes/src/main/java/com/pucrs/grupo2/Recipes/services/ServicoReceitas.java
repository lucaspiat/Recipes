package com.pucrs.grupo2.Recipes.services;

import com.pucrs.grupo2.Recipes.models.Receita;
import com.pucrs.grupo2.Recipes.repositories.RepositorioReceitas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicoReceitas {
    private RepositorioReceitas repReceitas;
    private Receita cacheReceita;

    @Autowired
    public ServicoReceitas(RepositorioReceitas repReceitas) {
        this.repReceitas = repReceitas;
        cacheReceita = null;
    }

    public Receita getNomeReceita(long matricula) {
        List<Receita> receitas = repReceitas.findByMatricula(matricula);
        if (receitas.size() == 0){
            throw new IllegalArgumentException("Receita nao encontrada");
        } else {
            cacheReceita = receitas.get(0) ;
            return cacheReceita;
        }
    }

    public List<Receita> listaDeReceitas() {
        List<Receita> receitas = repReceitas.findAll();
        return receitas;
    }

    public List<Receita> findTables() {
        List<Receita> receitas = repReceitas.findTables();
        return receitas;
    }

}