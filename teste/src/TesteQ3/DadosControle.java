
package TesteQ3;

import java.util.ArrayList;

public class DadosControle {
    
    ArrayList<Dados> carros;

     
    public ArrayList<Dados> maiorValor(ArrayList<Dados> carros){
        ArrayList<Dados> carrosCarros;
        carrosCarros=new ArrayList();

        //achar o valor mais alto
        Double mais=0.0;
        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getValor()>mais){
                mais=carros.get(i).getValor();
            }  
        }
        
        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getValor()>=mais ){
                mais=carros.get(i).getValor();
                carrosCarros.add(carros.get(i));
            }  
        }
        return carrosCarros;      
    }

    public ArrayList<Dados> menorValor(ArrayList<Dados> carros){
        ArrayList<Dados> carrosCarros;
        carrosCarros=new ArrayList();

        //achar o valor mais alto
        Double mais=0.0;
        for (int i = 0; i < carros.size(); i++) {
            if(carros.get(i).getValor()>mais){
                mais=carros.get(i).getValor();
            }  
        }
        
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getValor()!= 0.0){

                if(carros.get(i).getValor()<=mais ){
                    mais=carros.get(i).getValor();
                    carrosCarros.add(carros.get(i));
                }  
            }
        }
        return carrosCarros;      
    }
    
    public static Double somaPreco(ArrayList<Dados> carros){
        ArrayList<Dados> carrosCarros;
        
        //achar o valor mais alto
        Double total=0.0;
        for (int i = 0; i < carros.size(); i++) {
             total+=carros.get(i).getValor();
        }
        
        return total;      
    }


    
}