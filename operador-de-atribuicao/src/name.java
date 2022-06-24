public class name {import java.util.Scanner;


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double valorCompra;
            System.out.println("Informe o valor da compra");
            valorCompra = entrada.nextDouble();
            System.out.println("1-À vista 2-Parcelado");
            int tipoCompra, parcelas;
            tipoCompra = entrada.nextInt();
            if (tipoCompra == 2){
                System.out.println("Quantas parcelas?");
                parcelas = entrada.nextInt();
                System.out.println("Valor de cada parcela:" +
                        (valorCompra/parcelas));
            }
        }
    }
}
