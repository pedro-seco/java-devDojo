package academy.devdojo.maratonajava.introducao;

public class Aula05EstrurasCondicionaisExercicio02 {

    public static void main(String[] args) {
        byte dia = 7;
        switch (dia){
            default:
                System.out.println("Inválido");
                break;
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana");
        }
    }
}
