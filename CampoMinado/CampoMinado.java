public class CampoMinado
{
    private Mina[][]campo;
    public CampoMinado(Mina[][]c){
        campo = c;
    }
    public void destruir(int x, int y){
        String camp="";
        explotarVert(x,y,campo[x][y].getAlcance());
        explotarHor(x,y,campo[x][y].getAlcance());
    }
    //Para explotar vertical desde la mina hasta el borde o hasta
    //el alcance de la mina en ambos sentidos.
    public void explotarVert(int x, int y,int alc){
        for(int i = x+1;i<alc && i<(Math.abs(x-campo[y].length-1));i++){
            if(campo[i][y].getEstado() == 1){
                destruir(i,y); //recursividad :(
            }else{
               campo[i][y].destruir(); 
            }
        }
        for(int i = x-1;i<alc && i>=0;i--){
            if(campo[i][y].getEstado() == 1){
                destruir(i,y);
            }else{
               campo[i][y].destruir(); 
            }
        }
    }
    //Para explotar horizontal desde la mina hasta el borde o hasta
    //el alcance de la mina en ambos sentidos.
    public void explotarHor(int x, int y,int alc){
        for(int i = y+1; i<alc && i<(Math.abs(y-campo.length-1)) ;i++){
            if(campo[x][i].getEstado() == 1){
                destruir(x,i);
            }else{
               campo[x][i].destruir(); 
            }
        }
        for(int i = y-1;i<alc && i>=0;i--){
            if(campo[i][y].getEstado() == 1){
                destruir(x,i);
            }else{
               campo[x][i].destruir(); 
            }
        }
    }
}
