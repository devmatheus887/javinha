package br.com.abc.javacore.introducaometodos.test;
import br.com.abc.javacore.introducaometodos.classes.Calculadora;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("dentro do terste");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}
