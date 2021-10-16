
public class EJE_6
{ public String verificarNumero(int numero){
     String res ="";
     int sumatoriaDiv = calcularSumatoriaDiv (numero);
     if (sumatoriaDiv == numero){
         res = "Numero perfecto";
        }else{
           if(sumatoriaDiv > numero){
              res="numero abundante"; 
            }else{
              res= "nuemero es efectivo";  
            }
        }
        return res;
    }
    
  private int calcularSumatoriaDiv(int num){
      int res =0;
      for(int div =1 ; div<= (num/2); div++){
        if(num%div ==0){
            res = res+div;
        }
        }
        return res;
    }
}
