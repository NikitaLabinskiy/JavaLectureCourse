// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
package Seminar1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner in = new Scanner(System.in);
        int result = FillAndPrintArray(in);
        System.out.printf("Result: %d", result);
        in.close();
    }

    static int FillAndPrintArray(Scanner scanner) {
        int[] array = new int[7];
        int count = 1;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]){
                count += 1;
            }
            else{
                if (max < count){
                    max = count;
                }
                count = 1;
            }
        }
        return max;  
    }
}
