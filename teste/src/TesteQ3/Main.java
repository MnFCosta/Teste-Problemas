
package TesteQ3;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
        Dados dado;
        DadosControle dc;
        dc = new DadosControle();

        dado= new Dados();
        
        ArrayList<Dados> dados;
        dados= new ArrayList();
        
        JSONParser parser = new JSONParser();
       
        try {
            JSONArray dadosArquivo = (JSONArray) parser.parse( new InputStreamReader(new FileInputStream("D:/dados.json"), "UTF-8"));
            for (Object o : dadosArquivo){
                JSONObject dado_ = (JSONObject) o;
                String dia = dado_.get("dia").toString();
                Double valor = (Double) dado_.get("valor");
              
                            
                dado= new Dados();
                dado.setDia(dia);;
                dado.setValor(valor);;
                dados.add(dado);
            }
        } catch (Exception e) {
                e.printStackTrace();
        }   
        
        ComparaPorValor cpv;
        cpv=new ComparaPorValor();
        Collections.sort(dados,cpv);
        System.out.println("----Menor valor");
        dado.print(dc.menorValor(dados),false);
        System.out.println("----Maior Valor");
        dado.print(dc.maiorValor(dados),false);
        System.out.println("----Faturamento Total");

        DecimalFormat df;
        df = new DecimalFormat("#,##0.00");
        System.out.printf("%s",df.format(dc.somaPreco(dados)));

        System.out.println("\n----Média de Faturamento Diário");
        System.out.printf("%s",df.format(dc.somaPreco(dados)/21));

        System.out.println("\n----Dias em que o faturamento foi maior que a média");
        dado.print(dados,true);
    }
} 

        
    