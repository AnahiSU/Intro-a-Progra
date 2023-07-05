import java.util.ArrayList;
import java.util.Scanner;
public class Ringo
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        ArrayList <Integer> arr;
        arr = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            int aux = obj.nextInt();
            arr.add(aux);
        }
        int cont = 0;
        
        for(int i = 0; i<arr.size() ; i++){
            for (int j = i+1; j<arr.size() ; j++){
                if (Math.abs(arr.get(i) - arr.get(j)) % 200 == 0){
                    cont++;
                }
            }
        }
        
        System.out.print(cont);
    }
}
