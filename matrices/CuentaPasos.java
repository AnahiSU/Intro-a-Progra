public class CuentaPasos
{
    private int [][] matriz;
    private int x1, y1, x2, y2;
    private int pasos = 0, i = 0, j = 0;
    private int matActX = 0, matActY = 0; 
    public CuentaPasos(int [][] matriz, int x1, int y1, int x2, int y2){
        this.matriz = matriz;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        matActX = x1;
        matActY = y1;
    }
    //Método que cuenta los pasos necesarios. 
    //Este código primero hace una búsqueda diagonal y luego
    //vertical u horizontal.
    public int cuentaPasos(){
        //Primero va en diagonal hasta coincidir en columna o fila con x2,y2
        if(x1!=x2 && y1!=y2){
            if(x1 < x2 && y1 < y2){ 
                //abajo derecha
                i = x1+1;
                j = y1+1;
                while(x2 != i && y2 != j){
                    pasos += matriz[i][j];
                    matActX = i;
                    matActY = j;
                    i++;
                    j++;
                }
                pasos += sigueContando(i,j);
            }else{
               if(x1 < x2 && y1 > y2){
                    //abajo izquierda
                    i = x1+1;
                    j = y1-1;
                    while(x2 != i && y2 != j){
                        pasos += matriz[i][j];
                        matActX = i;
                        matActY = j;
                        i++;
                        j--;
                        
                    }
                    pasos += sigueContando(i,j);
                }else{
                    if(x1 > x2 && y1 < y2){
                        //arriba derecha
                        i = x1-1;
                        j = y1+1;
                        while(x2 != i && y2 != j){
                            pasos += matriz[i][j];
                            matActX = i;
                            matActY = j;
                            i--;
                            j++;
                        
                        }
                        pasos += sigueContando(i,j);
                    }else{
                        if(x1 > x2 && y1 > y2){
                            //arriba izquierda
                            i = x1-1;
                            j = y1-1;
                            while(x2 != i && y2 != j){
                                pasos += matriz[i][j];
                                matActX = i;
                                matActY = j;
                                i--;
                                j--;
                                
                            }
                            pasos += sigueContando(i,j);
                        }
                    }
                }
            }
            //Luego de recorrer diagonalmente, verifica si coincide en 
            //columna o fila, de ser así, llamar a la función contar
            //desde la posición actual.
            pasos += contarHorVer(matActX,matActY);
        }else{
            //Si ya coinciden, entonces empezar a recorrer en un sentido
            pasos += contarHorVer(x1, y1);
        }
        return pasos;
    }
    
    //Contar en horizontal o vertical
    private int contarHorVer(int actX, int actY){
            int total = 0;
            //Para diferencia de una celda.
            //recorridos de arriba hacia abajo - izquierda a derecha
            if (Math.abs(actX - x2) == 2 || Math.abs(actY - y2) == 2){
                if(x2 == actX && actY < y2){
                    total += matriz[x2][actY +1];
                }else{
                    if(y2 == actY && actX < x2){
                        total += matriz[actX+1][y2];    
                    }else{
                    //Para recorridos de abajoarriba - derecha izquierda 
                        if(x2 == actX && actY > y2){
                            total += matriz[x2][actY +1];
                        }else{
                            if(y2 == actY && actX > x2){
                                total += matriz[actX+1][y2];
                            }
                    }
                }
            }
        }else{
            //Para recorridos de arriba hacia abajo - izquierda derecha 
            if(x2 == actX && actY < y2){
                int c = Math.abs(y2-actY);
                for(int i = actY+1; i<y2 ; i++){
                    int aux = i + 1;
                    total += matriz[x2][i];
                }
            }else{
                if(y2 == actY && actX < x2){
                    int c = Math.abs(x2-actX);
                    for(int i = actX+1; i<x2; i++){
                        //int aux = i + 1;
                        total += matriz[i][y2];
                        
                    }
                    //Para recorridos de abajo - arriba -  derecha izquierda
                }else{
                    if(x2 == actX && actY > y2){
                        int c = Math.abs(y2-actY);
                        for(int i = actY-1; i>0 ; i--){
                            total += matriz[i][x2];
                            
                        }
                    }else{
                        if(y2 == actY && actX > x2){
                            int c = Math.abs(x2-actX);
                            for(int i = actX-1; i>0 ; i--){
                                total += matriz[x2][i];
                            }
                         }
                    }
                }
            }
         }
        return total;
    }
    //Contar si es que estamos en la última celda antes de cambiar de dirección
    //en la búsqueda diagonal
    private int sigueContando(int x, int y){
        int tot = 0;
        if((x2 == x && y2 != y) || (x2 != x && y2 == y)){
            tot = matriz[x][y];
            matActX = x;
            matActY = y;
        }
        return tot;
    }
}