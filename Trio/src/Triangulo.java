import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        double base, altura, total;
        Scanner texto = new Scanner(System.in);
        do{
            System.out.print("Base:");
            base = texto.nextDouble();
        }while (base <=0);
        do{
            System.out.print("Altura:");
            altura = texto.nextDouble();

        }while (altura <= 0);
        total = base * altura / 2;
        System.out.println("Area: " + total);
    }
}


    }
}