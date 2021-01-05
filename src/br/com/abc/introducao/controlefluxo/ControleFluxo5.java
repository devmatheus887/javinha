package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
        public static void main(String[] args) {
            //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
            //porém as parcelas nã o podem ser menores do que 1000

            double valorTotal = 30000;
            for (int parcela = 1; parcela <= valorTotal; parcela++) {
                double valorParcela = valorTotal / parcela;
                if(valorParcela >= 1000) {
                    System.out.println("parcela " + parcela + " R$" +valorParcela);
                }else{
                    System.out.println("saindo do laço");
                    break;
                }
                System.out.println("fora do laço!");

            }
        }

}

