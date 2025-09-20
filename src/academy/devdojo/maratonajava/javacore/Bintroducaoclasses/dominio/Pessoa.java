package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Pessoa {
    //ALTO ACOMPLAMENTO -> RUIM
    //ALTA COESÃO -> BOM
    //BAIXO ACOMPLAMENTO -> BOM
    //BAIXA COESÃO -> RUIM
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
