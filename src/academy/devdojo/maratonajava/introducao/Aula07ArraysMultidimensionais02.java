package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[1];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[2];


        int[][] arrayInt2 = {{0,0},{1,2},{3,4,5}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n-------");
            for (int item: arrayBase){
                System.out.println(item);
            }
        }
    }
}
