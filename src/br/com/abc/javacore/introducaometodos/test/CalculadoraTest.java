package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumero();
        calc.multiplicDoisNumeros(5,5);
        System.out.println("divisão de dois numeros");
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("imprimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,2);
        System.out.println("Continuando a exec");;
    }
}
