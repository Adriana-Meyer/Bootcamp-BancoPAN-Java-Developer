import java.util.Scanner;

public class TaxaImpostoRenda {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else {
            double impostoTotal = calculaImposto(salario);
            System.out.println("R$ " + String.format("%.2f", impostoTotal));
        }
    }

    public static double calculaImposto(double salario) {
        double imposto = 0d;

        for (int i = 0; salario > 2000; i++) {
            if (salario <= 3000) {
                double dif = salario - 2000;
                imposto = imposto + (dif * 0.08);
                salario = salario - dif;
            } else if (salario <= 4500) {
                double dif = salario - 3000;
                imposto =  imposto + (dif * 0.18);
                salario = salario - dif;
            } else {
                double dif = salario - 4500;
                imposto = imposto + (dif * 0.28);
                salario = salario - dif;
            }
        }
        return imposto;
    }
}
