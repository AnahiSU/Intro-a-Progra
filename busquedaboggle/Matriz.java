import java.util.ArrayList;

public class Matriz
{
    private char [][] mat;
    public Matriz(char [][] m){
        mat = m;
    }
    public ArrayList<Punto> busquedaBoggle(char [][] tab, String cad){
        ArrayList <Punto> lista = new ArrayList<Punto>();
        int k = 0;
        for(int i = 0;i<tab.length;i++){
            for(int j = 0; j<tab[i].length && k<cad.length();j++){
                if(cad.charAt(k)== tab[i][j] && !yaEsta(new Punto(i,j),lista)){
                    k++;
                    i=0;
                    j=0;
                }
            }
        }
        return sonAdyacentes(lista);
        }
        
    public boolean yaEsta(Punto p, ArrayList <Punto> lis){
        boolean res = false;
        for(int i = 0; i<lis.size();i++){
            if(p.getX() == lis.get(i).getX() && p.getY() == lis.get(i).getY()){
                res = true;
                i = lis.size();
            }
        }
        return res;
    }
    
    public ArrayList<Punto> sonAdyacentes(ArrayList<Punto> l){
        ArrayList<Punto> res = new ArrayList<Punto>();
        for(int i = 1; i<l.size();i++){
            int dif1 = Math.abs(l.get(i).getX() - l.get(i-1).getX());
            int dif2 = Math.abs(l.get(i).getY() - l.get(i-1).getY());
            if((dif1 == 1 && l.get(i).getY() == l.get(i-1).getY()) || (dif2 == 1 && l.get(i).getX() == l.get(i-1).getX())){
                res = l;
            }else{
                res.clear();
            }
        }
        return res;
    }
    }
    
    

