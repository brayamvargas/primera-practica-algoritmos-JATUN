public class EJE_4{
    public int Factorial (int numero){
        int res =1;
        if (numero == 0){
           res= 1; 
        }else{
          for(int i= 1;i<numero;i++){
            res = res*i;
            }
        }
        return res;
       
    }
}

