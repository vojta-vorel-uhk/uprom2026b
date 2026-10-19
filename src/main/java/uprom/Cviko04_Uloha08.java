package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko04_Uloha08
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/samples01.txt";
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if( (s.length() == 11) && (s.charAt(6) == '/')){
                if( s.charAt(2) == '5' || s.charAt(2) == '6'  ){
                    System.out.println("Žena");
                } else {
                    System.out.println("Muž");
                }
            } else {
                System.out.println("NOT OK");
            }
        }
        //	Přečíst všechny řádky ze souboru data/samples01.txt
        //  a vždy vypsat zda jde o rodné číslo muže nebo ženy (pokud je platné).
        //  Pokud není platné, vypsat "NOT OK".
    }
}
