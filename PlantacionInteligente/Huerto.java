public class Huerto
{
    private Planta [][] campo;
    private int dias;
    private int jugadas;
    private Monedero monedero;
    private boolean estado;

    public Huerto(){
        campo = new Planta[3][3];
        dias = 0;
        jugadas = 18;
        monedero = new Monedero();
        estado = false;
    }

    public void iniciar(){
        //crear el campo
        generarCampo();
    }

    public void regarHorizontal(int fila){
        if(enJuego()){
            for(int i = 0; i < 3; i++){
                if(campo[fila][i] != null){
                    campo[fila][i].regar(); 
                    if(campo[fila][i].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[fila][i].cosechar());
                        monedero.contarBonus(); //Cuenta si se tiene un bonus
                        campo[fila][i] = null;
                    }
                }else{
                    campo[fila][i] = generarPlanta();
                }
            }
            contarJugada();
        }else{

        }
    }

    public void regarVertical(int col){
        if(enJuego()){
            for(int i = 0; i < 3; i++){
                if(campo[i][col] != null){
                    campo[i][col].regar(); //Riega la planta
                    if(campo[i][col].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[i][col].cosechar());
                        monedero.contarBonus();
                        campo[i][col] = null;
                    }
                }else{
                    campo[i][col] = generarPlanta();
                }
            }
            contarJugada();
        }

    }

    public void usarBonus(int fil, int col){
        if(enJuego()){
            if(monedero.getBonus() > 0){
                if(campo[fil][col] != null){
                    campo[fil][col].regar(); 
                    if(campo[fil][col].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[fil][col].cosechar());
                        monedero.contarBonus();
                        campo[fil][col] = null;
                    }
                }else{
                    campo[fil][col] = generarPlanta();
                }
                monedero.usarBono();
            }
            contarJugada(); 
        }

    }

    private void contarJugada(){
        jugadas = jugadas-1;
    }
    //Modifica el atributo campo con 3 plantas aleatorias
    private void generarCampo(){
        int i;
        int j;
        int cont = 0;
        while(cont != 3){
            i = (int) (Math.random()*3);
            j = (int) (Math.random()*3);
            if(campo[i][j] == null){
                campo[i][j] = generarPlanta();
                cont++;
            }
        }
    }
    //Genera una plantita de cualquier tipo
    private Planta generarPlanta(){
        //Se genera un cada vez que se llama al método
        //un banco con tres objetos distintos en memoria.
        Planta[] bancoPlantas = {new Ramiper(), new Betometa(), new Rezagameta()};
        int aux = (int)(Math.random()*3);
        //Se selecciona uno
        Planta plantita = bancoPlantas[aux];
        return plantita;
    }
    //Si aún no se vació el campo
    private boolean enJuego(){
        int c = 0;
        for(int i = 0; i<3;i++){
            for(int k = 0; k<3;k++){
                if(campo[i][k] != null){
                    c = c+1;
                }
                if(c>=1 && jugadas > 0){
                    estado = true;
                }else{
                    estado = false;
                }
            }
        }
        return estado;
    }
    //Mostrar la matriz campo
    public String mostrarHuerto(){
        String huerto = "";
        for(int i = 0; i<3;i++){
            for(int k = 0; k<3;k++){
                if(campo[i][k] == null){
                    huerto = huerto + campo[i][k]+"\t";
                }else{
                    huerto = huerto + campo[i][k].getNombre() + "|"+ campo[i][k].getRegadas()+"|" +"\t";
                }
            }
            huerto += "\n" ;;
        }
        return huerto+ "Tus bonus: " + monedero.getBonus() + "\n"+ "Jugadas: " + jugadas + "\n" + "Dinero: "+
            monedero.getMonto() + "\n"+"-----------------";
    }

}
