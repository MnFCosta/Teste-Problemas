package TesteQ5;

// 5) Escreva um programa que inverta os caracteres de um string.

// IMPORTANTE:
// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
// b) Evite usar funções prontas, como, por exemplo, reverse;

public class Main {
    public static void main (String[] args) {
        
        String str= "atsivertnEarPessaPeMrovaFroP", nstr="";
        char ch;
        
      System.out.print("String Original: ");
      System.out.println(str);
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("String Reversa: "+ nstr);
    }
}

