package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Scanner leia = new Scanner(System.in);
        int maior=0;
        int menor=0;
        int qtd =0;
        int vet[];

        qtd= leia.nextInt();
        vet=new int[qtd];

        for (int i=0;i<vet.length;i++){
            System.out.println(vet[i]);
        }




    }
}
