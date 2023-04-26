
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Se asume que no se dará más de 30 o 31 días para recorrer o calcular la diferencia.
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int anho;
    
    public Fecha(int d,int m,int a){
        dia = d;
        mes = m;
        anho = a;
    }
    
    public void agregarDias(int dias){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 9 || mes == 11){
            if(dias >= 31 - dia){
                dia +=1;
            } else if(dias < 31 - dia && dias%31 != 0 ){
                dia += dias % 31;
                mes++;
            } else{
                if (mes + (dias / 31) < 12){
                    mes += (dias / 31);
                    dia += dias%30;
                }else{
                    mes += (dias/31) - 12;
                    dias += dias%30;
                    anho += 1;
                }
            }
        }
        if(mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12){
            if(dias >= 30 - dia){
                dia +=1;
            } else if(dias < 30 - dia && dias%30 != 0 ){
                dia += dias % 30;
                mes++;
            } else{
                if (mes + (dias / 30) < 12){
                    mes += (dias / 30);
                    dia += dias%31;
                }else{
                    mes += (dias/30) - 12;
                    dias += dias%31;
                    anho += 1;
                }
            }
        }
        if(mes == 2){
            if(dias >= 28 - dia){
                dia +=1;
            } else if(dias < 28 - dia && dias%30 != 0 ){
                dia += dias % 28;
                mes++;
            } else{
                if (mes + (dias / 28) < 12){
                    mes += (dias / 28);
                    dia += dias%31;
                    }
                }
            }
        }
        
    public String getFecha(){
        String res = "";
        if (dia <10){
            res = "0" + dia + "/";
        }else{
            res = dia +"/";
        }
        if (mes < 10){
            res = res + "0"+ mes;
        } else{
            res = res + "/" + mes;
        }
        res = res + "/" + anho;
        return res;
        }
    }
