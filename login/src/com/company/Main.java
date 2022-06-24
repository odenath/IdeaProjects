package com.company;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        double vet[]= new double[10] ;
        double vetB[]=new double[10] ;
        System.out.println("Digite o número que vc vai ler ");
        for (int i=0;i<vet.length;i++){
            vet[i]=leia.nextDouble();
        }
        vetB=vet;
        System.out.println(vetB[0]);
        for (int i=0;i< vetB.length;i++){
            System.out.println(vetB[i]);
        }


    }
}
