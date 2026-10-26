package uprom;

import java.util.Scanner;

public class Cviko05_Uloha02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.hasNextLine();
        String max = "";
        for (int i=0; i<count;i++){
            String s = scanner.nextLine();
            if(s.length() > max.length() ){
                max = s;
            }
        }
        System.out.println(max);
        // Přečti z konzole "count" řetězců
        // a nakonec vypiš nejdelší z nich
    }
}
