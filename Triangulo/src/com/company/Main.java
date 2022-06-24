import java.util.Scanner;

public class Main.java {
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Mês:");
            mes = teclado.nextInt();

            switch (mes){   //escolha do algoritmo
                case 1 :
                    System.out.println("Janeiro");
                    break;
                case 2 :
                    System.out.println("Fevereiro");
                    break;
                case 99 :
                    System.out.println("Finalizado com sucesso!!");
                    break;
                default:
                    System.out.println("Mês incorreto");
            }  //final do switch

            break;  //interrompeu o laço de repetição

        }while (mes != 99);

    }
}