package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko04_Uloha08
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/samples01.txt";
        Scanner scanner = new Scanner(new File(path));

        //	Přečíst všechny řádky ze souboru data/samples01.txt
        //  a vždy vypsat zda jde o rodné číslo muže nebo ženy (pokud je platné).
        //  Pokud není platné, vypsat "NOT OK".
    }
}
