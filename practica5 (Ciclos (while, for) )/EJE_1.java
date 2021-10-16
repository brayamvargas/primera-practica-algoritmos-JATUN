public class EJE_1
{ public int NumeroDigitos (int valor){
    int respuesta=0;
    int digito1 = valor/100;
    int digito2= digito1/10;
    respuesta=digito1+digito2;
    return respuesta;
    }
}
