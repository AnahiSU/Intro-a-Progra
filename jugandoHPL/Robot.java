
/*
Jugando HPL
Dos lanzadas y dos dados, es todo lo que separa al ganador del perdedor,
Hugo, Paco y Luis están decididos a hacer la mejor lanzada de sus vidas
aquel que saque el valor par más grande gana, así de simple es el juego.
Construye un programa que lea las lanzadas de Hugo, Paco y Luis en ese
orden y muestre quien es el ganador. Sin embargo, si no hay ningún par o
todos sacaron el mismo valor, entonces nadie gana.

Salida
Para cada caso de prueba, escribir el ganador del juego, si nadie ganó,
escribir NADIE
 */
public class Robot
{
    public String juguemosHPL(byte dado1H,byte dado2H,byte dado1P, byte dado2P, byte dado1L, byte dado2L){
        
        int sumaHugo = dado1H + dado2H;
        int sumaPaco = dado1P + dado2P;
        int sumaLuis = dado1L + dado2L;
        int mayor = -1;
        String resultado = "NADIE";
        if ((sumaHugo <= 12 && sumaHugo > 1) && (sumaPaco <= 12 && sumaPaco > 1) && (sumaLuis <= 12 && sumaPaco > 1)){
            if (sumaHugo % 2 == 0){
                mayor = sumaHugo;
                resultado = "GANA HUGO";
            }
            if (sumaPaco % 2 == 0 && sumaPaco > mayor){
                mayor = sumaPaco;
                resultado = "GANA PACO";
            }
            if (sumaLuis % 2 == 0 && sumaPaco > mayor){
                mayor = sumaLuis;
                resultado = "GANA LUIS";
            }
            }
            return resultado;
        }
        
    }


