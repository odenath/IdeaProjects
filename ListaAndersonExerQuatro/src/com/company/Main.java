package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vet[];
        int vetT=0;
        int vetN=0;
        int i=0;
        boolean achou=false;

        System.out.println("Digite o número do tamanho do vetor ");
        vetT= leia.nextInt();
        vet=new int [vetT];
        for ( i=0;i<vet.length;i++){
            vet[i]= (int) (Math.random()*100);
            System.out.println(vet[i]);
        }
        System.out.println("Digite o número q vc está procurando");
        vetN= leia.nextInt();

        for ( i=0;i<vet.length;i++){
            if (vet[i]==vetN){
                achou=true;
                break;

            }
        }
        if (achou==true){
            System.out.println("Achou"+vetN+"Indice"+(i+1));
        }else {
            System.out.println("N existe no vetor");
        }
        System.out.println("Desordenado");
        for ( i = 0; i<vet.length;i++){
            System.out.println(vet[i]);
        }
        //Bubble Sort
        for (i=0;i<vet.length-1;i++){
            for (int j=i+1;j<vet.length;j++){
                if (vet[i]>vet[j]){
                    int temp=vet[i];
                    vet[i]=vet[j];
                    vet[j]=temp;

                }
            }
        }
        System.out.println("Ordenado");
        for (i=0;i<vet.length;i++){
            System.out.println(vet[i]);
        }
        achou=false;








    }
}
