import java.util.Scanner;

public class QuitandaSeuZe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantKgMorangos = scan.nextInt();
        int quantKgMacas = scan.nextInt();

        double precoMorango = 0d;
        double precoMacas= 0d;
        double totalCompra = 0d;
        int quantTotalKg = quantKgMorangos + quantKgMacas;

        if (quantKgMorangos <= 5) {
            precoMorango = (2.5 * quantKgMorangos);
        } else {
            precoMorango = (2.2 * quantKgMorangos);
        }

        if (quantKgMacas <= 5) {
            precoMacas = (1.8 * quantKgMacas);
        } else {
            precoMacas = (1.5 * quantKgMacas);
        }

        totalCompra = precoMorango + precoMacas;

        if (totalCompra > 25.0 || quantTotalKg > 8 ) {
            totalCompra = totalCompra - (totalCompra * 0.1);
        }

        System.out.println(totalCompra);
    }
}
