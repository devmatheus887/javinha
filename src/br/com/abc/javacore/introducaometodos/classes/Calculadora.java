package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumero() {
        System.out.println(5 - 5);
    }

    public void multiplicDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
    }
}
