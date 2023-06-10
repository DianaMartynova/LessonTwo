import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //EASY!
        System.out.println("Введите размер двумерного массива");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str = "X";
        String[][] massiv = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                massiv[i][j] = str;
            }
        }
        System.out.println(Arrays.deepToString(massiv));


        //MEDIUM!
        System.out.println("Введите размер массива");
        int sizeMassiv = scanner.nextInt();
        int[] massivTwo = new int[sizeMassiv];
        //int max, min;
        Random rendom = new Random();
        for (int i = 0; i < sizeMassiv; i++) {
            massivTwo[i] = rendom.nextInt(10);
            System.out.println(massivTwo[i]);
        }




//HARD не выполнила
        System.out.println("Введите размер двумерного массива");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] massivTree = new int[c][d];
        for (int i = 0; i < c; i++) {
            System.out.print("X");
            for (int j = 0; j < d; j++) {
                System.out.print("Y");

            }
            System.out.println();


        }
        System.out.println("Повернутый массив");
        for (int i = 0; i < c; i++) {
            if (i == 0) {
                System.out.print("X");
            } else
                System.out.print("Y");
            for (int j = 0; j < d; j++) {
                System.out.print("X");
            }
            System.out.println();


        }

    }
}