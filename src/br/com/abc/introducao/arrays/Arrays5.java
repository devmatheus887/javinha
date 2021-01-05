package br.com.abc.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] arrINt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for(int[] arr : dias) {
            for(int num : arr){
                System.out.println(num);
            }
        }
    }
}
