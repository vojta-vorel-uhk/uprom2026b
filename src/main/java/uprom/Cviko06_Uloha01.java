package uprom;

import java.util.Scanner;

public class Cviko06_Uloha01
{
    public static void main(String[] args)
    {
        // Z konzole načti řetězec
        // Vypiš, kolik v tomto řetězci je mezer
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
