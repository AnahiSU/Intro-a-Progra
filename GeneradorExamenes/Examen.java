
/**
 * Write a description of class Examen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Examen
{
    private Pregunta [] preguntas;
    private double nota;
    private int nroPreguntas;
    
    public Examen (int n, double v){
        nroPreguntas = n;
        nota = v;
        preguntas = new Pregunta [n];
        
    }
}
