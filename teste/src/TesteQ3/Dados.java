package TesteQ3;

import java.text.DecimalFormat;
import java.util.ArrayList;


class Dados {
    String dia;
    Double valor;
    DadosControle dc;
    
    public String getDia() {
        return dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    

    public void print(ArrayList<Dados> dados, boolean cond){

        DecimalFormat df;
        df = new DecimalFormat("   #,##0.00");
        System.out.print((String.format("%-10s", "Dia")));
        System.out.printf("%15s","Valor");
        System.out.println("");
        int count = 0;
        for (int i = 0; i < dados.size(); i++) {
            if(dados.get(i).getValor() > DadosControle.somaPreco(dados)/21 && ++count > 0){
                System.out.print((String.format("%-10s", dados.get(i).getDia())));
                System.out.printf("%15s",dados.get(i).getValor());
                System.out.println("");
            }
            
        }
        if(cond == true){
            System.out.printf("\nHouveram %d dias onde o faturamento diário foi superior a média mensal",count);
        }
    }


}