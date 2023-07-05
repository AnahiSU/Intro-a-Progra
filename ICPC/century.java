import java.util.Scanner;
public class century
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        
        int cent =(int) obj.nextInt();
        if (cent%100 == 0){
             cent = (int) (cent/ 100);
        }else{
            cent = (int)cent/100 + 1;
        }
        System.out.print(cent);
    }
}

