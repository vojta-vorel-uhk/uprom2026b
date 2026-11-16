package uprom;

public class Cviko08_Uloha05
{
    public static void main(String[] args)
    {
       /*
        Vytvoř a využij metodu, která pro daný
        řetězec a číslo vrátí znak na dané pozici
        (jako charAt), ale pokud je pozice mimo
        platný rozsah, vrátí prázdný řetězec
        */
        String s ="AHOJ";
        System.out.println(s.charAt(10));
    }

    public static String safeCharAt(String s, int i){
        if(i >= s.length() || i < 0){
            return "";
        }
        return Character.toString(s.charAt(i));
    }
}
