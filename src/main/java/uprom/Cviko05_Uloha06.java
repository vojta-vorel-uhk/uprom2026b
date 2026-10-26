package uprom;

import java.util.Scanner;

public class Cviko05_Uloha06
{
    public static void main(String[] args)
    {
        // Z konzole načti přirozené číslo N
        // Opakuj následující postup dokud N nebude rovné 1:
        // - pokud je sudé, vyděl N dvěma
        // - pokud je liché, vynásob N třemi a přičti 1
        // (viz https://en.wikipedia.org/wiki/Collatz_conjecture)
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        while ( n != 1 ) {
            if(n % 2 == 0){
                n = n/2;
            }
            else{
                n = n*3+1;
            }
            System.out.println(n);
        }
    }
}
