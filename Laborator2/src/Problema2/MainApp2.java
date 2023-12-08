package Problema2;

import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class MainApp2 {

    public static void main(String[] args) throws IOException
    {

        String nume_fis_in = "cantec_in.txt";
        String nume_fis_out = "cantec_out.txt";

        BufferedReader flux_in = new BufferedReader(new FileReader(nume_fis_in));
        PrintStream flux_out = new PrintStream(nume_fis_out);

        Random my_random = new Random();

        Vers vers;
        String linie;

        while ((linie = flux_in.readLine()) != null)
        {
            vers = new Vers(linie);

            if (my_random.nextFloat() < 0.3)
                vers.Majucule();


            flux_out.print(vers.getVers() + " " + vers.Nr_Cuv() + " " + vers.Nr_vocale() + " ");

            if (vers.Final("at"))
                flux_out.print("*");

            flux_out.print("\n");

        }




    }

}
