
public class EJE_10
{  public String verificar (int numero){
  String res ="";
  int binario = DesimalBinario (numero);
  int contadorUnos=0;
  while(binario > 0){
      int dig= binario%10;
      if(dig == 1){
         contadorUnos++;
        }
        binario = binario/10;
        
    }
    if(contadorUnos ==1){
      res ="numero malvado";  
    }else{
      res ="numero odioso";  
    }
    return res;
}

private  int DesimalBinario (int numero ){
        int resultado =0;
        int base =10;
        int exponente = 0;
        while(numero>0){
            int valorbinario = numero%2;
            resultado = (valorbinario*(int)Math.pow(base,exponente)) +resultado;
            exponente++;
            numero= numero/2;
        }
        return resultado;
    }   
}