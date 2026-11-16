package uprom;

import java.util.Locale;

public class Cviko08_Uloha07
{
    public static void main(String[] args)
    {
         /*
        Vytvoř a využij metodu, která
        daný řetězec převede na velká písmena
        a na konec připojí daný počet vykřičníků
        */
        String s = "Dobrý den";
        System.out.println(shout(s,5));
    }

    public static String shout(String s, int exclamations){
        String caps = s.toUpperCase();
        for(int i=0; i<exclamations; i++){
            caps = caps + "!";
        }
        return caps;
    }

}
