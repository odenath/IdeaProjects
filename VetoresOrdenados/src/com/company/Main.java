package com.company;

public class Main {

    public static void main(String[] args) {

	boolean sim = false;

    int vet[] =new int[]{6,9,4,5,2,7,8,1,0};
    int temp,soma=0;



    for (int i=0;i< vet.length;i++){
        for(int j=i+1;j< vet.length;j++){
            if(vet[j]<vet[i]){
                temp=vet[i];
                vet[i]=vet[j];
                vet[j]=temp;
                soma++;
            }

        }
    }
    for (int a=0;a< vet.length;a++){
        System.out.println(vet[a]);
    }
        System.out.println(soma);
    }
}