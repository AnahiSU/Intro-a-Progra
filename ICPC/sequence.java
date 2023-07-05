
import java.util.Scanner;
public class sequence
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        String res = "";
        for(int i = 0; i<val; i++){
            String nombre = scanner.next();
            int altura = scanner.nextInt();
            int mayor = 0;
            int segundo = altura;
            if(mayor<altura){
                mayor = altura;
            }
            if(segundo > altura){
                segundo = altura;
                res = nombre;
                }
            }
            System.out.println(res);
        }
        
    }


