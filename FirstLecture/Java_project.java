package FirstLecture;

import java.util.Scanner;

public class Java_project {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Hello world");
        var x = 1223;
        System.out.println(x);
        FillAndPrintArray();
    }

    static void FillAndPrintArray() {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        in.close();
    }

}
