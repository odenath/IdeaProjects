import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;
        do{
            System.out.print("Base:");
            base = teclado.nextDouble();
        }while (base <=0);
        do{
            System.out.print("Altura:");
            altura = teclado.nextDouble();

        }while (altura <= 0);
        area = base * altura / 2;
        System.out.println("Area: " + area);
    }
}