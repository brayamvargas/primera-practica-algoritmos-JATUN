
public class eje_9
{ public int DesimalBinario (int numero ){
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
