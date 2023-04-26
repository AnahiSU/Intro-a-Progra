
/**
 * Write a description of class ZonaDano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZonaDano
{
    //Atributos
    private Explosivo exp1, exp2;
    private Ubicacion esqSupI, esqInfD;
    
    //Constructores
    public ZonaDano(Explosivo exp1, Explosivo exp2, Ubicacion esqSupI, Ubicacion esqInfD){
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.esqSupI = esqSupI;
        this.esqInfD = esqInfD;
    }
}
