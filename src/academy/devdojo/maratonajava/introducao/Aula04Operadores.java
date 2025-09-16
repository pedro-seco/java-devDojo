package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos
        // + - / * %
        int numero1 = 24;
        int numero2 = 69;
        boolean teste1 = 21 > 10 || 50 == 30;
        boolean teste2 = 30 > 25 && 69 != 24;
        boolean isPadraoFormatoBoolean = true;

        //Operadores Lógicos
        // &&   (and)
        // ||   (or)
        // !    (not)
        // ==   (igual)
        // <    (maior) > (menor)
        // >=   (maior igual) <= (menor igual)
        // !=   (diferente)

        System.out.println(numero1 + numero2);  //soma
        System.out.println(numero1 - numero2);  //subtração
        System.out.println(numero2 / numero1);  //divisão
        System.out.println(numero1 * numero2);  //multiplicacao
        System.out.println(numero2 % numero1);  //resto
        System.out.println(teste1);
        System.out.println(teste2);

        // Atribuição
        // += -= *= /= %=

        double bonus = 1000;
        System.out.println(bonus += 300);
        System.out.println(bonus -= 300);
        System.out.println(bonus *= 300);
        System.out.println(bonus /= 300);
        System.out.println(bonus %= 300);

        int i = 0;
        //i++ ++i i-- --i (tem diferença entre colocar atrás e colocar na frente
    }
}
