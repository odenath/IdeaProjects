package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
        int []vetdias=new int[10];
        int total = 0, menor = 0, maior = 0;
            for (int i=0;i<vetdias.length ;i++){
                System.out.println("Digite o dia");
                vetdias[i] = input.nextInt();
                  if (vetdias[i] < 0) {
                   i = vetdias.length +1; //break na raça
                  }else {
                      if (i==0){
                          menor= vetdias[i];
                      }
                      if (vetdias[i]>maior
                      }
                  }


        }

	    }
}
