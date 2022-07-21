package TesteQ3;

import java.util.Comparator;

class ComparaPorValor implements Comparator<Dados>{
    @Override
    public int compare(Dados d1, Dados d2) {  
        if(d1 == null || d2 == null)  
            System.out.println("Valor em branco");  
        Double v1 = d1.getValor();
        Double v2 = d2.getValor(); 

        return  v1.compareTo(v2); 
    }
}

