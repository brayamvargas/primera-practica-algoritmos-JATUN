
public class EJE_3
{public int invertirNumero(int num){
        int res =0;
        int exp = contardigitos (num)-1;
        int mult = (int)Math.pow(10,exp);
        while(num > 0){
            int dig = num%10;
            res= res+(dig*mult);
            num = num/10;
            mult = mult/10;

        }
        return res;
    }
    
 private int contardigitos(int numero){
        int res =0;
        if(numero == 0){
            res = 1;
        }else{
            while(numero != 0){
                res++;
            }
        }
        return res;
    }
}

