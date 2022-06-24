package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //2. Faça um algoritmo para ler diversos caracteres informados pelo dispositivo de entrada. Depois
        //imprima:
        //a) a quantidade total de letras “A” e “Z” informadas;
        //b) a quantidade de caracteres informados;
        //c) a quantidade de consoantes;
        //d) a maior letra informada (de acordo com a ordem alfabética); e
        //e) a quantidade de pontos de exclamação informados.


	    Scanner leia= new Scanner(System.in);
        String texto="";

        System.out.println("Digite o texto");
        texto=leia.nextLine();
        while (texto != "pare"){

            texto=leia.nextLine();

            int qtdCarac = 0;
            int qtdConso = 0;
            int qtdExclama =0;
            char carc = ' ';
            char carm =' ';

            for(int i=0;i<texto.length();i++){
                carc=texto.charAt(i);
                if(Character.isLetter(carc)){
                    qtdCarac++;
                }if(carc!='a'&& carc!='e'&& carc!='i'&&carc!='o'&&carc!='u'){
                    qtdConso++;
                }if(carc>carm){
                    carm=carc;
                }if(carc=='!'){
                    qtdExclama++;
                }

            }

            System.out.println("qtde cara "+qtdCarac+"qtd de conso "+qtdConso+" Maior "+carm+" Qtd !"+qtdExclama);
        }








    }
}
