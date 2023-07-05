import java.util.Scanner;
public class stamina
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        long life = obj.nextLong();
        long decrease = obj.nextLong();
        long cont = 0;
        
        cont = life/decrease;
        if (life%decrease != 0){
           cont += 1; 
        }
        
        
        System.out.print(cont);
    }
}