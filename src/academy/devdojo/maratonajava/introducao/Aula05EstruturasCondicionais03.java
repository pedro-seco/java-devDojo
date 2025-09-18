package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Não vou doar";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar; // Operador ternário (condicao) ? verdadeiro : falso
        // não usar o operador ternario para mais de um if (dá mas é uma merda)

        System.out.println(resultado);
    }
}
