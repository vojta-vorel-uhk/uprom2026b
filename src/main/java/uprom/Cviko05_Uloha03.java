package uprom;

import java.util.Scanner;

public class Cviko05_Uloha03
{
    public static void main(String[] args)
    {
        // Načtěte z konzole řetězec, například jedno slovo.
        // Vypište ho "shora dolů" (jako jeden znak na každý řádek).
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0; i< str.length() ; i++){
            System.out.println(str.charAt(i));
        }
    }
}
