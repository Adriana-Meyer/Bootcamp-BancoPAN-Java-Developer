import java.util.Scanner;

public class FibonacciFacil2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int atual = 1;
        int anterior = 0;
        int proximo = 0;

        for(int i = 0; i < n; i++) {

            if (n == 1) {
                System.out.print(proximo);
            } else if (i == n-1) {
                proximo = atual + anterior;
                System.out.print(proximo);
            } else if (i < 2) {
                System.out.print(i + " ");
            } else {
                proximo = atual + anterior;
                anterior = atual;
                atual = proximo;
                System.out.print(proximo + " ");
            }

        }
    }
}
