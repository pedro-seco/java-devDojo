package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        double salario = 55000;
        double faixa01 = 0.097;
        double faixa02 = 0.3735;
        double faixa03 = 0.4950;

        if (salario <= 34712) {
            System.out.println("Taxas: " + salario * faixa01);
        } else if (salario <= 68507 && salario >= 34713) {
            System.out.println("Taxas: " + salario * faixa02);
        } else if (salario >= 68508) {
            System.out.println("Taxas: " + salario * faixa03);
        }
    }
}
