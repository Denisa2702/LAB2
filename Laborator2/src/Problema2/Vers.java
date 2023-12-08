package Problema2;

public class Vers {

    private String vers;

    public Vers(String vers)
    {
        this.vers = vers;
    }

    public String getVers()
    {
        return vers;
    }

    public int Nr_Cuv()
    {
        return vers.split(" ").length;
    }


    public int Nr_vocale()
    {
        int k=0;
        for(char c:vers.toCharArray())
        {
            if(Vocala(c))
                k++;
        }

        return k;
    }

    public boolean Vocala(char c)
    {
        String voc="aeiouAEIOU";
        return voc.contains(String.valueOf(c));
    }

    public boolean Final(String cuv)
    {
        return vers.endsWith(cuv);
    }

    public void Majucule()
    {
        vers=vers.toUpperCase();
    }


}
