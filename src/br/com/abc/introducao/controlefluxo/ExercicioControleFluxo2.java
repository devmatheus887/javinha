package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 63;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opçaõ inválida!");
        }
    }
}
