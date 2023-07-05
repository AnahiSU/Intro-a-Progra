
/**
 * Write a description of class saltarin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saltarin
{
    private String cadena;
    private char [] array;
    
    public saltarin(String c, char [] array){
        cadena = c;
        this.array = array;
    }
    public String pasosSaltar(){
        String pasos = "|";
        int indexAnt = 0;
        int i=0, j=0;
        boolean banderita = true;
        int mayor = 0;
        int menor = 0;
        while(banderita){
            if (i == cadena.length() && j == array.length){
                banderita = false;
            }else if(j == array.length){
                j = 0;
            }
            if (cadena.charAt(i) != array[j]){ 
                j++;
            }else{
                int [] listita = indices(array, cadena.charAt(i));
                if (listita.length != 1){
                    for(int k=1; k<listita.length;k++){
                        int aux = listita[k-1] - indexAnt;
                        int aux2 = listita[k] - indexAnt;
                        if (Math.abs(aux)< Math.abs(aux2)){
                            menor = aux;
                        }else{
                            menor = aux2;
                        }
                        }
                    pasos += menor +"|" ;
                    }else{
                        pasos += (listita[0] - indexAnt) + "|" ;
                }
                
                if(i == cadena.length()-1){
                    banderita = false;
                }
                i++;
                indexAnt = j;
                j++;
                mayor = 0;
            }
        }
        return pasos;
    }
    public int[] indices(char [] arr, char letra){
        int cont = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == letra){
                cont = cont+1;
            }
        }
        int [] lista = new int [cont];
        int index = 0;
        int aux = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == letra){
                index = i;
                lista[aux] = i;
                aux ++;
            }
        }
        return lista;
    }
}
