import java.util.ArrayList;
/**
 * Write a description of class Generador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Generador
{
    private ArrayList <Pregunta> bancoPreguntas;
    private Examen examen;
    
    public Examen generador(int n){
        if(bancoPreguntas.size()<n){
            
        }else{
            examen = new Examen(boolean v);
            Pregunta pregun; 
            for(int i = 0; i<n ;i++){
                do{
                    pregun = seleccionar();
                }while(examen.tiene(pregun));
                examen.anadir(pregun);
            }
        }
        return examen;
    }
}
