package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String text = "We wrote new string in our file and put it in variable 's'!";
        // try{
        //     PrintStream prTstrm = new PrintStream("C:\\Users\\Никита\\Desktop\\Никита\\test.txt");
        //     prTstrm.println(text);
        //     prTstrm.println("Меня завут Никита, мне 24 года и я учу язык Java!");
        //     prTstrm.close();
        //     System.out.println("Запись прошла успешно!");
        // } catch (Exception ex){
        //     System.out.println(ex.getMessage());
        // } 

        // Записываем текст в виде байтов в наш файл!!!
        try{
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\Никита\\Desktop\\Никита\\test.txt", true);
            byte buff[] = text.getBytes();
            fileOutput.write(buff);
            fileOutput.close();
            System.out.println("Запись прошла успешно!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } 
        
        // Считываем текст из файла и помещаем его в переменную!!!
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

        // Считываем первую строку текста из файла и помещаем его в переменную!!!(Вариант 2)
        // try{
        //     Scanner scan = new Scanner(new File("C:\\Users\\Никита\\Desktop\\Никита\\test.txt"));
        //     String result = scan.nextLine();
        //     System.out.print(result);
        //     scan.close();
        // }catch(Exception e){
        //     System.out.print(e.getMessage());
        // }
    }
}
