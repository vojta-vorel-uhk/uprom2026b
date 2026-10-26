package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko05_Uloha05
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/obce.txt";
        Scanner scanner = new Scanner(new File(path));

        // Vypiš, kolik procent obcí v ČR má víceslovný název
    }
}
