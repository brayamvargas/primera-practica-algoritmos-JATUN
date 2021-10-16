
public class EJE_5
{ public int Calcular(int num1, int num2){
        int res =0;
        int acarreo=0;
        while(num1 > 0 || num2 > 2){
            int valor1 = num1%10;
            int valor2 = num2%10;
            int suma = valor1+valor2+acarreo;
            if(suma>9){
                res++;
                acarreo=1;
            }else{
                acarreo=0;  
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return res;
    }

}
