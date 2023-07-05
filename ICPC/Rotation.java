import java.util.Scanner;
public class Rotation
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String n = obj.nextLine();
        for(int i = 0; i<n.length();i++){
            if(n.charAt(i) == '9'){
                
            }else{
                if(n.charAt(i) == '6'){
                    n.replace("6", "9");
                }
            }
        }
        System.out.println(n);
    }
}