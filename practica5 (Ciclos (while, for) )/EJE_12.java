
public class EJE_12
{ public int Divicion(int dividendo, int divisor){
        int res=0;
        while(dividendo>= divisor){
            dividendo = dividendo-divisor;
            res++;
        }
        return res;
    }
}
