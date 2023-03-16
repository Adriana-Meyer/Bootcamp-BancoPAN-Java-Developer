import java.util.Scanner;

public class TrianguloOuTrapezio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double ladoA = scan.nextDouble();
        double ladoB = scan.nextDouble();
        double ladoC = scan.nextDouble();

        double perimetroTriangulo = ladoA + ladoB + ladoC;
        double areaTrapezio = ((ladoA + ladoB) * ladoC) / 2;

        if (isTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Perimetro = " + perimetroTriangulo);
        } else {
            System.out.println("Area = " + areaTrapezio);
        }
    }

    public static boolean isTriangulo (double a, double b, double c) {
        if ( a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }
}
