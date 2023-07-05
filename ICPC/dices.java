
import java.util.Scanner;

public class dices
{
    public static void dices(String args[]){
        Scanner obj = new Scanner(System.in);
        int n1 = 7 - obj.nextInt();
        int n2 = 7 - obj.nextInt();
        int n3 = 7 - obj.nextInt();
        int sum = n1 + n2 + n3;
        System.out.print(sum);
    }
}

