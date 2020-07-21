package com.pucrs.grupo2.Recipes.interfaces;

import java.util.List;
import com.pucrs.grupo2.Recipes.services.ServicoReceitas;
import com.pucrs.grupo2.Recipes.models.Receita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta_receita")

public class ClienteFachadaRemota {
    private ServicoReceitas sConsultaRec;

    @Autowired    
    public ClienteFachadaRemota (ServicoReceitas sConsultaRec) {
		this.sConsultaRec = sConsultaRec;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/dadosreceita")
        public Receita getDadosReceita(@RequestParam Long matricula) {
        Receita receita = sConsultaRec.getNomeReceita(matricula);
        return receita;
    }    
    
    @CrossOrigin(origins = "*")
    @GetMapping("/listareceitas")
    public List<Receita> getTabelaReceitas() {
        List<Receita> receitas = sConsultaRec.findTables();
        return receitas;
    }
    
}