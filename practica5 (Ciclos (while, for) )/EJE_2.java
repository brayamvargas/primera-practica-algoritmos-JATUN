
public class EJE_2
{ public String PrimoCompesto (int numero){
        boolean Esprimo= true; 
        for(int div =2; div <= (numero/2) && Esprimo == true ; div++){
            if(numero%div==0){
                Esprimo= false;
            }else{

            }
        }
        String res ="";
        if(Esprimo == true){
            if(numero == 1){
               res="el numero es compuesto";
            }else{
               res= "el numero es primo"; 
            }
            
        }else{
            res="el numero es compuesto";
        }
        return res;
    }

}
