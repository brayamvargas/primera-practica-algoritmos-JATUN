
public class Eje_7
{ public String Dañar (int num1, int num2){
    String res ="";
    int valor1 = num1/num2;
    int valor2 = num2/num1;
    
    if(num1%num2 == 0 || num2%num1 == 0){
        res = "si";
    }else{
        res = "no";
    }
    return res;
} 
}
