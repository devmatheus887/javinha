package br.com.abc.introducao.controlefluxo;

import java.sql.SQLOutput;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        crie uma variavel salario e imprima seu imposto:
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 4000 15%
        salario > 5000 20%
         */
        double salario = 5500;
        double totalimposto = 0;
        if(salario < 1000) {
            totalimposto = salario * 0.05;
        }else if(salario>= 100 && salario < 200){
            totalimposto = salario * 0.1;
        }else if(salario>=2000 && salario < 4000) {
            totalimposto = salario * 0.15;
        }else{
            totalimposto = salario * 0.2;
        }
        System.out.println("o imposto é de: "+totalimposto);
    }
}
