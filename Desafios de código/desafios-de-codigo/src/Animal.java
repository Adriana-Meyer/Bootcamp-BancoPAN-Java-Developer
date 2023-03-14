import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String caract1, caract2, caract3;

        caract1 = scan.nextLine();
        caract2 = scan.nextLine();
        caract3 = scan.nextLine();

        if (caract1.equals("vertebrado")) {
            if (caract2.equals("ave")) {
                if (caract3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                    if (caract3.equals("onivoro")) {
                        System.out.println("homem");
                    } else {
                        System.out.println("vaca");
                }
            }
        } else {
            if (caract2.equals("inseto")) {
                if (caract3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (caract3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

    }
}

