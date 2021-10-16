public class EJE_8{
 public String cambiarvalores (int num){
     String res ="";
     int ultimoDigito= num&10;
     int primerDigito= 0;
     while(num > 10){
         num = num/10;
         primerDigito = num%10;
         res= ultimoDigito+""+primerDigito;
        }
        return res; 
    }
}
