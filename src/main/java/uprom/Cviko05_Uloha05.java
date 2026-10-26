package uprom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cviko05_Uloha05
{
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"/data/obce.txt";
        Scanner scanner = new Scanner(new File(path));
        int count = 0;
        while (scanner.hasNextLine()){
            String obec = scanner.nextLine();
            boolean viceslovna = obec.contains(" ");
            if(viceslovna){
                count = count + 1;
            }
        }
        System.out.println(count / 6258d * 100+"%");
        // Vypiš, kolik procent obcí v ČR má víceslovný název
    }
}
