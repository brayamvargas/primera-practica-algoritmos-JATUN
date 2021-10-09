
public class Eje_1
{ public String Capicua ( int numero ){
        String res = "";
        int Ultimo = numero%10;
        int Primero= numero/100;
        if(Ultimo == Primero){
            res = "si";
        }else{
            res = "no";
        }
        return res;
    }   

}

