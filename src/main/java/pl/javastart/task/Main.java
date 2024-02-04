package pl.javastart.task;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = inputNumber("wierszy.");
        int columns = inputNumber("kolumn.");
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = i * j;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%5d |", array[i][j]);
            }
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print("-------");
            }
            System.out.println();
        }
    }

    static int inputNumber(String name) {
        int number = 0;
        while (number <= 0 || number > 100) {
            System.out.println("Podaj liczbę " + name);
            number = scanner.nextInt();
        }
        return number;
    }
}
