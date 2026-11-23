package uprom;

public class Cviko09_Uloha03
{
    public static void main(String[] args)
    {
        int[] mojePole = {4,658,788,1566,5777,9789,8778,10604,15630,16884};
        System.out.println(isAscending(mojePole));
    }

    public static boolean isAscending(int[] values){
        for(int i=0; i<values.length-1; i++){
            if(values[i] > values[i+1]){
               return false;
            }
        }
        return true;
    }
    // TODO 1:
    //  Vytvoř medotu isAscending, která otestuje, zda dané pole
    //  celých čísel je vzestupně seřazené

}
