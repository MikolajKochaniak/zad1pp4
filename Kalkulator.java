import java.util.ArrayList;
public class Kalkulator {
    ArrayList<Integer>listaZakupow = new ArrayList<Integer>();
    ArrayList<Integer>indexyVat23 = new ArrayList<Integer>();
    ArrayList<Integer>indexyVat8 = new ArrayList<Integer>();
    
    Integer cena_sumaryczna(){
        Integer suma = 0;
        for(Integer i:listaZakupow){
            suma+=i;
        }
        return suma;
    }
    double cena_sumaryczna_vat23(){
        double suma_vat_23 = 0;
        for(int i = 0;i<listaZakupow.size();i++){
            for(int j = 0;i<indexyVat23.size();i++){
                if(i != indexyVat23.get(j)){
                    i++;
                }
                else{
                    suma_vat_23 += listaZakupow.get(i)*0.23;
                }
        }
    }
    return suma_vat_23;
}
    double cena_sumaryczna_vat8(){
        double suma_vat_8 = 0;
        for(int i = 0;i<listaZakupow.size();i++){
            for(int j = 0;i<indexyVat8.size();i++){
                if(i != indexyVat8.get(j)){
                    i++;
                }
                else{
                    suma_vat_8 += listaZakupow.get(i)*0.08;
                }
        }
    }
return suma_vat_8;
}
public String toString(){
    return "Sumaryczna wartość zamówienia: " + cena_sumaryczna() + " Sumaryczna wartość vat 23%: "+ cena_sumaryczna_vat23()+" Sumaryczna wartość vat 8%: "+ cena_sumaryczna_vat8();
}
}
