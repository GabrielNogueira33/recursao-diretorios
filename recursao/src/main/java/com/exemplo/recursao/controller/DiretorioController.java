package com.exemplo.recursao.controller;

import com.exemplo.recursao.service.DiretorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diretorios")
public class DiretorioController {

    @Autowired
    private DiretorioService diretorioService;

    @GetMapping("/tamanho")
    public String obterTamanho(@RequestParam String caminho){
        long tamanho = diretorioService.calcularTamanhoDiretorio(caminho);

        return String.format("Tamanho: %d bytes", tamanho);
    }
}
