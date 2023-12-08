package Problema3;

import java.util.Scanner;

public class MainApp3 {

    public static void main(String[] args) {

        Scanner my_scanner=new Scanner(System.in);

        StringBuilder sir1=new StringBuilder("Ana are mere");
        StringBuilder sir2=new StringBuilder("HAHAHA");

        System.out.print("Introdu pozitia: ");
        int index = my_scanner.nextInt();

        System.out.println("Primul sir: "+sir1);
        System.out.println("Sirul care va fi introdus: "+sir2);
        System.out.println("Pozitia: "+index);

        StringBuilder sir3=new StringBuilder();

        sir3= new StringBuilder(sir1.substring(0, index)+sir2+ sir1.substring(index));
        System.out.println("Sirul obtinut este: "+sir3);

        int poz, nr;
        System.out.println("Pentru stergere:");
        System.out.print("Intodu pozitia: ");
        poz=my_scanner.nextInt();
        System.out.println("Introdu numarul de caractere: ");
        nr=my_scanner.nextInt();

        sir3.delete(poz, poz+nr);

        System.out.println("Sirul dupa stergere: "+sir3);



    }

}
