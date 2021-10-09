
public class Eje_10
{ public String Cresimiento( int numero){
        String res ="";
        int valor1 = numero/100;
        int aux = numero/10;
        int valor2  =aux%10;
        int valor3 = numero%10;
        
        if (valor1<= valor3 && valor2<= valor3){
            res= "Es un numero en cresimineto";
        }else{
            res= "No es una valor en cresimiento";
        }
        return res;
        }
    }
