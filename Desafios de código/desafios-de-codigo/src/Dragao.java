import java.util.Scanner;

public class Dragao {

    public static void main(String[] args) {
        int casos;
        int poderDeLuta;

        Scanner scan = new Scanner(System.in);
        casos = scan.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = scan.nextInt();

            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
    }
}
