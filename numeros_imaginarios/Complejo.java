
/**
 * Write a description of class Complejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complejo
{
    private double real;
    private double imaginario;
    private Complejo comp;
    public Complejo (double real, double imag){
        this.real = real;
        imaginario = imag;
    }

    public Complejo sumar(Complejo otro){
        comp = new Complejo(real + otro.real, imaginario + otro.imaginario);
        comp.real = real + otro.real;
        comp.imaginario = imaginario + otro.imaginario;
        return comp;
    }
    
    public Complejo restar(Complejo otro){
        comp = new Complejo(real - otro.real, imaginario - otro.imaginario);
        comp.real = real - otro.real;
        comp.imaginario = imaginario - otro.imaginario;
        return comp;
    }
    
        public Complejo multiplicar(Complejo otro){
            comp = new Complejo((real * otro.real) - (imaginario * otro.imaginario), (real * otro.imaginario) + (imaginario * otro.real));
            comp.real = (real * otro.real) - (imaginario * otro.imaginario);
            comp.imaginario = (real * otro.imaginario) + (imaginario * otro.real);
            return comp;
    }
    
        public Complejo dividir(Complejo otro){
            Complejo num = multiplicar(new Complejo(otro.real,-otro.imaginario));
            Complejo den = otro.multiplicar(new Complejo(otro.real,-otro.imaginario));
            comp.real = Math.round(((num.real / den.real) * 1000000.0))/1000000.0;
            comp.imaginario = Math.round(((num.imaginario / den.real) * 1000000.0))/1000000.0;
            comp.real = comp.real;
            comp.imaginario = comp.imaginario;
            return comp;
        }
    public double obtenerReal(){
        return comp.real;
    }
        public double obtenerImaginario(){
        return comp.imaginario;
    }
}
