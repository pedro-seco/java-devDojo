package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    private void mediaSalarios() {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        System.out.println("Média salarial: " + (soma / salarios.length));
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salarios[i]);

        }
        mediaSalarios();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double... salarios) {
        this.salarios = salarios;
    }
}
