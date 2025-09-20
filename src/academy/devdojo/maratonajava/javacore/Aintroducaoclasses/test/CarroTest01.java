package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Ferrari";
        carro01.modelo = "F-150";
        carro01.ano = 1970;

        carro02.nome = "Honda";
        carro02.modelo = "Civic";
        carro02.ano = 2020;

        carro01 = carro02;

        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);
    }
}
