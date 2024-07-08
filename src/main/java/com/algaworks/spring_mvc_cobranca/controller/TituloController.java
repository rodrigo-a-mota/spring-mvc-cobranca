package com.algaworks.spring_mvc_cobranca.controller;

import com.algaworks.spring_mvc_cobranca.model.Titulo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/titulos")
public class TituloController {

    @RequestMapping("/novo")
    public String novo() {
        return "CadastroTitulo";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(Titulo titulo) {

        System.out.println(">>>>> " + titulo.getDescricao());

        return "CadastroTitulo";
    }
}
