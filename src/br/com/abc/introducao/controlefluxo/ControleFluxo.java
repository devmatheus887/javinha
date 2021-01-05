package br.com.abc.introducao.controlefluxo;

import java.sql.SQLOutput;

public class ControleFluxo {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;
        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }

}

