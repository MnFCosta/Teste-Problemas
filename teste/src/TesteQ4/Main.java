package TesteQ4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> count = new HashMap<String, Double>();
        count.put("SP", 67.83643);
        count.put("RJ", 36.67866);
        count.put("MG", 29.22988);
        count.put("ES", 27.16548);
        count.put("Outros", 19.84953);
        
        double soma = count.get("SP") + count.get("RJ") + count.get("MG") + count.get("ES") + count.get("Outros");
        System.out.printf("Faturamento Mensal da Empresa %f R$\n", soma);

        for (Map.Entry<String, Double> entry : count.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            double percent = (value/soma) * 100;
            System.out.printf("\nEstado: %s R$, Valor Contribuído: %f R$, Porcentagem de Contribuição: %.2f%%\n",key,value,percent);
        }
    }
}
