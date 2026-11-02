package uprom;

import java.util.Scanner;

public class Cviko06_Bonus3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Psaní rukou:
        int h = scanner.nextInt();
        for(int i=0; i < h; i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
        // NEBO: for(int i=0; i < h; i=i+2) a bez if
    }
}
