package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade1 = 18;
        boolean isMaiorDeIdade1 = idade1 >= 18;
        if (isMaiorDeIdade1) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }

        int idade2 = 15;
        boolean isMaiorDeIdade2 = idade2 >= 18;
        if (!isMaiorDeIdade2) {
            System.out.println("Menor de Idade");
        } else {
            System.out.println("Maior de Idade");
        }
    }
}
