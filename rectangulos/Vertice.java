
/**
 * Write a description of class Vertice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vertice
{
    private int x;
    private int y;
    
    public Vertice (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public double distancia(Vertice otro){
        double dist = Math.sqrt(Math.pow((x - otro.x),2) + (Math.pow((y - otro.y),2)));
        return dist;
    }
    
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }
    
    
    public boolean porDerechaSup(Vertice ver){
        boolean aux = false;
        if (x < ver.x && y > ver.y){
            aux = true;
        }
        return aux;
    }
    public boolean porDerechaInf(Vertice ver){
        boolean aux = false;
        if (x < ver.x && y < ver.y){
            aux = true;
        }
        return aux;
    }
    public boolean porIzquierdaSup(Vertice ver){
        boolean aux = false;
        if (x > ver.x && y > ver.y){
            aux = true;
        }
        return aux;
    }
    public boolean porIzquierdaInf(Vertice ver){
        boolean aux = false;
        if (x > ver.x && y < ver.y){
            aux = true;
        }
        return aux;
    }
}
