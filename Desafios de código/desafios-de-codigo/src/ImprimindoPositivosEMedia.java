import java.util.Scanner;

public class ImprimindoPositivosEMedia {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int quantPositivos = 0;
        double media = 0d;
        double soma = 0d;

        for (int i = 0; i < 6; i++) {
            double numero = scan.nextDouble();

            if (numero > 0) {
                quantPositivos++;
                soma = soma + numero;
            }
        }

        media = soma / quantPositivos;

        System.out.println(quantPositivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
