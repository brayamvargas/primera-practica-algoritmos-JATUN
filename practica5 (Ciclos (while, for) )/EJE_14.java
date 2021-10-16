public class EJE_14
{ public String VerifecarValores (int num1, int num2){
    String res = "";
    if(num1 != num2){
        int sumadorDivisoresnum1 = sumadorDivisores (num1)-1;
        int sumadorDivisoresnum2 = sumadorDivisores (num2)-1;
        if(num1 == sumadorDivisoresnum2  && sumadorDivisoresnum1 == num2){
           res = "Son novios"; 
        }else{
          res = "Son numeros ideales";  
        }
    }
    return res;
}
private int sumadorDivisores (int num){
    int res =0;
    for(int div=1; div<num;div++){
      res = res+div;  
    }
    return res;
}
}
