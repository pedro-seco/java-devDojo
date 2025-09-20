package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epis;
    private String genero;

    public void init(String nome, String tipo, int epis){
        this.nome = nome;
        this.tipo = tipo;
        this.epis = epis;
    }

    public void init(String nome, String tipo, int epis, String genero){
        this.init(nome,tipo,epis);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epis);
        System.out.println(this.genero);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpis(int epis) {
        this.epis = epis;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpis() {
        return epis;
    }

    public String getGenero() {
        return genero;
    }
}
