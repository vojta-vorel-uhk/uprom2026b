package uprom;

public class Cviko09_Uloha04
{
    public static void main(String[] args)
    {
        int[] inputs = {23,75,69,65,25,29,61,10,9,75,33,58,72,90,68,100,77,55,31,39,1};
        System.out.println(count(inputs,58));
    }

    public static int count(int[] values, int find){
        int count = 0;
        for(int i=0; i<values.length; i++){
            if(values[i] == find){
                count++;
            }
        }
        return count;
    }
    // TODO 1:
    //  Vytvoř a otestuj medotu count, která zjistí,
    //  kolikrát se v daném poli celých čísel
    //  vyskytuje daná hodnota
}
