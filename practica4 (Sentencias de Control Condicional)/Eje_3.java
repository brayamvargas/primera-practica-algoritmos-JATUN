
public class Eje_3
{ public String CruzDeDariel (int digito){
        String res="";
        if(digito<10){
            res="es un dia normal";
        }else{
            int valor1 = digito%10;
            int valor2 = digito/10;
            
            if((valor1%2 == 0  && valor2%2 ==0) || (valor1%2 != 0  && valor2%2 !=0)){
                res ="es un dia normal";
            }else{
              res = "cruz de dariel";  
            }
        }
        return res;

    }
}
