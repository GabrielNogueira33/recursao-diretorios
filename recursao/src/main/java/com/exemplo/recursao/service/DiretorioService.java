package com.exemplo.recursao.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class DiretorioService {
    // Criar um método recursivo que percorre todos os
    //  diretorios somando o tamanho do seu conteudo

    public long calcularTamanhoDiretorio(String caminho){
        File arquivo = new File(caminho);

        if(!arquivo.exists()){
            return 0;
        }

        if(arquivo.isFile()){
            return arquivo.length();
        }

        long total = 0;
        File[] itens = arquivo.listFiles();
        if(itens != null){
            for (File item : itens){
                total += calcularTamanhoDiretorio(item.getAbsolutePath());
            }
        }

        return total;
    }
}
