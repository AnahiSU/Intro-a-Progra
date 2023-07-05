public class Mina
{
    private char id;
    private int alcance;
    private int estado;
    private boolean destruido;
    public Mina(char id,int est,int alc){
        this.id = id;
        alcance = alc;
        estado = est;
        destruido = false;
    }
    public int getAlcance(){
        return alcance;
    }
    public int getEstado(){
        return estado;
    }
    public void destruir(){
        destruido = true;
    }
    //Si es que se gusta imprimir una mina
    public String verMina(){
        String mina = "("+id+", "+estado+", "+alcance+")";
        return mina;
    }
}
