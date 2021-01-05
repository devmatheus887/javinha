package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfesorTest {
    public static void main(String[] args) {
        Professor julio = new Professor();
        julio.nome = "Julio";
        julio.matricula = "89484";
        julio.rg = 846846468;
        julio.cpf = 4468445-8787;


        System.out.println(julio.nome);
        System.out.println(julio.matricula);
        System.out.println(julio.rg);
        System.out.println(julio.cpf);
    }
}
