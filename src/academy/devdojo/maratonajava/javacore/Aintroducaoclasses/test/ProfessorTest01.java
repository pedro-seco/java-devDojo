package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Joao";
        professor01.idade = 30;
        professor01.sexo = 'M';
        System.out.println(professor01.nome + professor01.idade + professor01.sexo);
    }
}
