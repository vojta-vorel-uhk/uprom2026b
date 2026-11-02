package uprom;

import java.util.Scanner;

public class Cviko06_Uloha03
{
    public static void main(String[] args)
    {
        // Načítej řádky z konzole.
        // Pokud byl pětkrát za sebou zadán prázdný řádek, program končí
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while( count < 5 ){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                count = count+1;
            } else {
                count = 0;
            }
        }
        System.out.println("UKONČENO");
    }
}
