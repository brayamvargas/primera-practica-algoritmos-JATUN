
public class Pravtica_n4
{ public int CalcularHojas (int canpg){
        int respuesta = 0; 
        int  div = canpg/2;
        int mod = canpg%2;
        respuesta = div + mod;
        return respuesta;
    }

}
