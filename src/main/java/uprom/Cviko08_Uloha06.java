package uprom;

public class Cviko08_Uloha06
{
    public static void main(String[] args)
    {
         /*
        Vytvoř a využij metodu, která
        spočítá délku daného řetězce, ale nepočítá mezery
        Např. pro "J. K. Rowling" vrátí 11
        */
        String s = "J. K. Rowling";
        System.out.println(delkaBezMezer(s));
    }

    public static int delkaBezMezer(String s){
        int c=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ')
                c++; // c= c+1;
        }
        return c;
    }


}
