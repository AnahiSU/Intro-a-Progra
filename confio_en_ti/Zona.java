
/**
 * Write a description of class Zona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zona
{
    //atributos
    private Ubicacion esqInfD, esqSupI;
    private ZonaDano espDano;
    
    //constructor
    public Zona(Ubicacion esqInfD, Ubicacion esqSupI,ZonaDano espDano){
        this.esqInfD = esqInfD;
        this.esqSupI = esqSupI;
        this.espDano = espDano;
    }
}
