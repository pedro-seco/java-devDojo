package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(69,24);

        System.out.println(resultado);

        calculadora.imprimeDivisaoDoisNumeors(420,69);
    }
}
