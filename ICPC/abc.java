import java.util.Scanner;
public class abc
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int times = obj.nextInt();
        
        int res = 0;
        for(int i = 0; i<=times; i++){
            if(num %200 == 0){
                num = num/200;
            }else{
                String num1 = ""+ num;
                num1 = num1 + "200";
                num = Integer.parseInt(num1);
            }
        }
        
        System.out.print(num);
    }
}