
/**
 * Write a description of class robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot {
    public double cantidadTinta(int b, int a){
        

        double radio     = (double) b/2; 
        double altura    = (double)(a-b)/2; 
        double mediatriz = 2 * (Math.sqrt(radio*radio - altura*altura));
        double angulo    = Math.acos(1-((mediatriz*mediatriz)/(2*radio*radio)));
               angulo    = Math.toDegrees(angulo);
        double tinta     = (4 * Math.PI * radio * (1 - (angulo/360))) + mediatriz;
        
        return tinta;
    }
}

