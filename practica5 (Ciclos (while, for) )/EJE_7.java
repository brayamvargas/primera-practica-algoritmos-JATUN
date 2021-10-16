public class EJE_7
{ public String indicarValor(int valor){
        String res ="";
        int suma =0;
        int cantidadDigitos= contarDigitos(valor);
        int guardarOriginal = valor;
        while(valor > 0){
            int digito = valor%10;
            int resultado = (int)Math.pow(digito,cantidadDigitos);
            suma = suma+resultado;
            valor = valor/10;

        }
        if (suma == guardarOriginal){
            res = "Narcisista";
        }else{
            res = "Normal";
        }
        return res;
    }
   private int contarDigitos (int valor){
       int res =0;
       while(valor > 0){
           valor = valor /10;
           res++;
           
        }
        return res;
    }
}
