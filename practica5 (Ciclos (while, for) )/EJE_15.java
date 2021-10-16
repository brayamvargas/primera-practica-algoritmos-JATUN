public class EJE_15
{ public String valoresUnicornio (int numero){
    String res = "";
    int contador= contadorDig(numero);
    if(contador %2 == 0){
       contador = contador/2;
       int aux1 = numero/(int)Math.pow(10,contador);
       int aux2 = numero%(int)Math.pow(10,contador);
       aux1 = aux1%10;
       aux2 = aux2/ (int)Math.pow(10,contador-1);
       int suma=  aux1 + aux2;
       if(suma%3 ==0){
           res = "numero unicornio";
        }else{
            res= "numero normal";
        }
    }else{
        contador = contador/2;
        int aux1= numero/(int)Math.pow(10,contador);
        aux1 = aux1%10;
        if(aux1%3==0){
           res= "numero unicornio"; 
        }else{
           res = "numero normal"; 
        }
    }
    return res;
    }
  private int contadorDig(int num){
      int res = 0;
      while(num > 0){
          num=num/10;
         res++;
          
        }
        return res;
    }
}
