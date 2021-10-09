public class Eje_9
{ public String Identificador(int wata){
        String res="";

        if((wata%4==0)&& (wata%100!=0)||(wata%400==0)){
            res ="es biciesto";
        }else{
            res="no es bosiseso";
        }
        return res;
    }
}  

