package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Lufft";

        for(int i=0; i<nomes.length;i++)
            System.out.println((i + 1) + " nome"+nomes[i]);

    }
}
