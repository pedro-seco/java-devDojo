package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
     // oito tipos primitivos
        int inteiro = (char) 10;        // 4 bytes
        double dobro = 1000000000.0D;   // 8 bytes
        float flutuante = 100f;         // 4 bytes
        char caracter = '\u0051';       // 2 bytes  unicode ou ASCII
        byte baite = 10;                // 1 byte
        short baixo = 5600;             // 2 bytes
        long looongo = 69696969L;       // 8 bytes
        boolean verdadeiro = true;      // 1 bit
        String linha = "texto";         // Não é um tipo primitivo, é uma classe

        // Os diversos tipos primitivos existem porque a memória era cara, hoje em dia não faz tanta diferença
        // Casting -> Mudar o tipo de uma variável tipo variavel = (tipo) valor

        System.out.println(inteiro);
        System.out.println(dobro);
        System.out.println(flutuante);
        System.out.println(caracter);
        System.out.println(baite);
        System.out.println(baixo);
        System.out.println(looongo);
        System.out.println(linha);
        System.out.println(verdadeiro);

        System.out.println("aqui vai um inteiro: "+ inteiro );
        System.out.println("um " + baite + " byte");
    }
}
