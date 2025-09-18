package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Pedro";
        nomes[1] = "Enzo";
        nomes[2] = "Luiz";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];
        nomes[3] = "Quarto nome";
        nomes[4] = "Quinto nome";
    }
}
