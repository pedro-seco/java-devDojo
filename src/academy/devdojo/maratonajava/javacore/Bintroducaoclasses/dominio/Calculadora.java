package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(69 - 24);
    }

    public void multiplicaDoisNumeros(int num01, int num02) {
        System.out.println(num01 * num02);
    }

    public double divideDoisNumeros(double num01, double num02) {
        if (num02 == 0) {
            return 0;
        } else {
            return num01 / num02;
        }
    }

    public void imprimeDivisaoDoisNumeors (double numerador, double divisor){
        if (divisor == 0){
            System.out.println("Indefinido");
        } else {
            System.out.println(numerador/divisor);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println(num1 + " " + num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
