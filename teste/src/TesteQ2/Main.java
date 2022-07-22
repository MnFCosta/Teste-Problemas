package TesteQ2;

// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

// IMPORTANTE:
// Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long f(int n){
        int F = 0;
        int anterior = 0;
        
        for (int i = 0; i <=n; i++) {

            if (i == 1){
                F = 1;
                anterior = 0;
            }else{
                F += anterior;
                anterior = F - anterior;
            }
            
        }
        return F;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean found = false;
        System.out.println("Forneça um numero inteiro");
        int num = scan.nextInt();
        long[] c = new long[num + 1];

        for (int i = 0; i <= num; i++) {
            c[i] = Main.f(i);
        }
        
        for(long x : c){
            if(x == num){
                found = true;
                break;
            }
        }

        if(found == true){
            System.out.println("Pertence");
        }else{
            System.out.println("Não pertence");
        }
        scan.close();

    }
}

        
        



