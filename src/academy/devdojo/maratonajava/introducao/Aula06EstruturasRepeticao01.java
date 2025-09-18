package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }

        i = 0;

        do {
            System.out.println("pelo menos uma vez " + ++i);
        } while (i < 10);

        for (int j = 0; j < 10; ++j) {
            System.out.println("For " + j);
        }
    }
}
