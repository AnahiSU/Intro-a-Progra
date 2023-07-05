import java.util.ArrayList;
public class Palindromos
{
    private String cad;

    public Palindromos(String cad){
        this.cad = cad;
    }
    
    public String encontrarPalindromo(){
        int i = 0;
        int j = cad.length()-1;
        String pal, res = "";
        //Arreglo dinámico que contiene todos los palindromos de una cadena
        ArrayList <String> arr = new ArrayList <String> (); 
        while(i<cad.length()-1 && j>i){
            //Si se detectan caracteres iguales
            if(cad.charAt(i) == cad.charAt(j)){ 
                //Verificar si son extremos de un palindromo
                pal = palExiste(i,j,cad); 
                //Si es un palindromo, guardar
                if(pal.length()>1){ 
                    arr.add(pal);
                    i++;
                    j= cad.length()-1;
                    //Si la cadena es un palindromo,retornarla
                    if(pal.length() == cad.length()){
                        i = cad.length();
                        res = pal;
                    }
                    
                }else{
                    //Sino, continúa la busqueda de extremos
                    j--;
                }
            }else{ 
                //Si son distintos, continuar con la búsqueda
                j--;
            }
            if(j == i){
                //Si no se contraron más extremos,
                //continuar con el siguiente caracter
                //y volver al final de la cadena para
                //buscar extremos otra vez
                i++;
                j = cad.length()-1;
            }
        }
        //Si se acabó la búsqueda, analizar el arreglo
        //y elegir el palindromo más grande
        for(i = 0; i<arr.size()-1;i++){
            if(arr.get(i).length() < arr.get(i+1).length()){
                if(arr.get(i).length() > res.length()){
                    res = arr.get(i);
                }
            }else{
                if(arr.get(i).length() > res.length()){
                    res = arr.get(i);
                }
            }
        }
        return res;
    }
    
    //Si es que los extremos a y b de una cadena forman un
    //palindromo devolver dicho palindromo o el primero si
    //son del mismo tamaño
    private String palExiste(int a, int b, String cad){ 
        String aux = "",aux2 = "";
        String res = "";
        for(int i = a; i<=b; i++){
            aux = aux+cad.charAt(i);
        }
        for(int i = b; i>=a; i--){
            aux2 = aux2+cad.charAt(i);
        }
        for(int i = 0; i<aux.length();i++){
            if(aux.charAt(i) != aux2.charAt(i)){
                i = aux.length();
                res = "";
            }else{
                res = aux;
            }
        }
        return res;
    }
}
