// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.
package Seminar2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task1 {
    public static void main(String[] args) {
        String text1 = "text";
        String text = Text(text1);
        try{
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\Никита\\Desktop\\Никита\\test.txt", true);
            byte buff[] = text.getBytes();
            fileOutput.write(buff);
            fileOutput.close();
            System.out.println("Запись прошла успешно!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } 
        
        StringBuffer s = new StringBuffer();
        try{
            final FileInputStream inputStream = new FileInputStream("C:\\Users\\Никита\\Desktop\\Никита\\test.txt");
            int i = -1;
            while ((i = inputStream.read()) != -1){
                // System.out.print((char)i);
                s.append((char)i);
            }
            inputStream.close();
            // System.out.println("Запись прошла успешно!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } 
        System.out.println(s);
    }

    static String Text(String data){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(data);
        }
        return str.toString();
    }
}
