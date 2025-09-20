package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.ImpressoraEstudantes;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Pedro";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "luiz";
        estudante02.idade = 35;
        estudante02.sexo = 'M';

        estudante02.imprime();
        estudante01.imprime();

    }
}
