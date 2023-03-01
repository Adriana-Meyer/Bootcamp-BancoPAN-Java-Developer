import java.util.Scanner;

public class SomaHComNTermos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double h = 1.0d;
        double soma = h;

        for (int i = 2; i <= n; i++) {
            soma = soma + (h/i);
        }

        System.out.println(Math.round(soma));
    }
}
