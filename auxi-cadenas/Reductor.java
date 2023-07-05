
/**
 * Write a description of class Reductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reductor
{
    int n;
    int contador;
    public int reducir(int n){
        int cont = 0;
        int segD = n %10;
        int primD = (int)(n/(Math.pow(10,contarDigi(n)-1)));
        if(n/10 != 0){
            int num1 = n % (int)(Math.pow(10,contarDigi(n)-2));
            num1 = num1 / 10;
            int num2 = n / (int)(Math.pow(10,contarDigi(n)-2));
            num2 = num2 % 100;
            
        }
        return cont;
    }
    
    public int contarDigi(int n){
        int res = 0;
        do{
            n = (n/10);
            res +=1;
        }while(n > 0);
        return (int)res;
    }
}
