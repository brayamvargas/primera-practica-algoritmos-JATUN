public class Eje_8
{ public String Fechas(int d, int m, int a){
    String mLiteral ="";
    switch(m) {
        case 1:mLiteral = "Enero";break;
        case 2:mLiteral = "Febrero";break;
        case 3:mLiteral = "Marzo";break;
        case 4:mLiteral = "Abril";break;
        case 5:mLiteral = "Mayo";break;
        case 6:mLiteral = "Junio";break;
        case 7:mLiteral = "Julio";break;
        case 8:mLiteral = "Agosto";break;
        case 9:mLiteral = "Septiebre";break;
        case 10:mLiteral = "Octubre";break;
        case 11:mLiteral = "Noviembre";break;
        case 12:mLiteral = "Diciembre";break;
        default: mLiteral = "Dato no valido";
        
    }
    return d+"de"+mLiteral+"de"+a;
}
    
}