package com.company;

public class Main {

    public static void main(String[] args) {
        int ret = buscaSequencial(65);
        System.out.println(ret);

    }

    public static int buscaSequencial(int valorPesquisado){
        int[] vetor = new int[]{10, 12, 45, 65, 25};
        for (int i = 0; i <= 9; i++) {

            if (vetor[i] == valorPesquisado) {
                return vetor[i];
            }
        }
        return 0;

    }

}