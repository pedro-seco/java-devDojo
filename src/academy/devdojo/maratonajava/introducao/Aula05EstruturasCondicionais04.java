package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia){
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            default:
                System.out.println("Inválido");
            case 'M':
                System.out.println("Masculino");
            case 'F':
                System.out.println("Feminino");
        }
    }
}
