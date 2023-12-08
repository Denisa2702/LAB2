package Problema1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp1 {

    public static void main(String[] args) throws IOException {

        String nume_fis="judete_in.txt";
        String linie;
        int nr=0;
        String[] judete=new String[8];

        BufferedReader flux_in=new BufferedReader(new FileReader(nume_fis));
        Scanner scan=new Scanner(System.in);

        while((linie=flux_in.readLine())!=null)
        {
            judete[nr]=linie;
            nr++;
        }

        String[] s= Arrays.copyOf(judete, nr);
        Arrays.sort(s);

        System.out.println("Judetele in ordine alfabetica:\n"+nr);

        for(String c:s)
             System.out.println(c);

        System.out.println("Ce judet doriti sa cautati: ");
        String judet_cautat=scan.nextLine();
        System.out.println((Arrays.binarySearch(s, judet_cautat)+1));




    }
}
