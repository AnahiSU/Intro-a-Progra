
/**
 * Write a description of class Rectángulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private Vertice vSupIz, vInfIz, vSupDer, vInfDer;
    private double ladoSup, ladoInf, ladoDer, ladoIz;
    
    public Rectangulo(Vertice vSI,Vertice vSD,Vertice vII,Vertice vID){
         vSupIz = vSI;
         vSupDer = vSD;
         vInfIz = vII;
         vInfDer = vID;
         ladoSup = vSupIz.distancia(vSupDer);
         ladoInf = vInfIz.distancia(vInfDer);
         ladoDer = vInfDer.distancia(vSupDer);
         ladoIz = vInfIz.distancia(vSupIz);
    }
    
    public String esRectangulo(){
        String res = "";
        if (ladoSup == ladoInf && ladoDer == ladoIz && vInfIz.getX() == vSupIz.getX() &&
            vSupDer.getX() == vInfDer.getX() && vInfIz.getY() == vInfDer.getY() && 
            vInfIz.getY() == vSupIz.getY()){
            res = "Es rectángulo";
        } else {
            res = "No es rectángulo";
        }
        return res;
    }
    public String esCuadrado(){
        String res = "";
        if(ladoSup == ladoInf && ladoSup == ladoDer && ladoSup == ladoIz){
            res = "Es cuadrado";
        } else {
            res = "No es cuadrado";
        }
    
        return res;
    }
    public double calcularArea(){
        double area;
        double altura = ladoDer;
        double base = ladoInf;
        area = base * altura;
        return area;
    }
    
    public String estaDentro(Rectangulo rec){
        String res = "";
        if(vSupIz.porDerechaSup(rec.vSupIz) && vInfIz.porDerechaInf(rec.vInfIz) &&
        vSupDer.porIzquierdaSup(rec.vSupDer) && vInfDer.porIzquierdaInf(rec.vInfDer)){
            res = "Está dentro";
        }
        else{
            res = "No está dentro";
        }
        return res;
    }
}