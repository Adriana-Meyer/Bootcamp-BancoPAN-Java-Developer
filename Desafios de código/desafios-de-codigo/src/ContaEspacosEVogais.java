import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine().toLowerCase();

        String[] strSplit = frase.split("");

        int espacosEmBranco = 0;
        int quantVogais = 0;

        List<String> arrVogais = Arrays.asList("a", "e", "i", "o", "u");

        for (String letra : strSplit) {
           if (arrVogais.contains(letra)) quantVogais++;
           if(letra.equals(" ")) espacosEmBranco++;
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

    }
}
