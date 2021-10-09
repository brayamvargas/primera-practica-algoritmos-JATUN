
public class Eje_5
{ public String Amigos (int valor1, int valor2){
        String res = "";
        int Primero = valor1%valor2;
        int Ultimo = valor2%valor1;
      
        if (valor1%valor2 == 0 || valor2%valor1 == 0){
            res="son parientes";
        }else{
            res = "no son parientes";
        }
        return res;
    }
}
