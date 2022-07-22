package TesteQ4;

// 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

// SP – R$67.836,43
// RJ – R$36.678,66
// MG – R$29.229,88
// ES – R$27.165,48
// Outros – R$19.849,53

// Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

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
