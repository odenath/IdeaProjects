package com.company;

public class Main {

    public static void main(String[] args) {
    //Vetor serve para armazenar valor do mesmo tipo
	// declarando um vetor tipo[] nomeVet = new tipo[5]
        String[] nome= new String[5];
        nome[0]="Gustavo";
        nome[1]="Gu";
        nome[2]="Gustavo";
        nome[3]="Gu";
        nome[4]="Gus";

        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(nome[2]);
        System.out.println(nome[3]);
        System.out.println(nome[4]);

        for (int contador=0;contador<5;contador++){
            System.out.println(nome[contador]);
        }
//Array.fill(numero,0);


    }
}
