package iohomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Класс для тестирования
 * @author Polly
 */
public class IOHomeWork {

    public static void main(String[] args) throws IllegalArgumentException, IOException{
        if(args.length == 0){
            throw new IllegalArgumentException("Неверный ввод.");
        }
        try{
            File fl = new File(args[0]);
            CheckWords check = new CheckWords();
            System.out.println(check.getSumWords(fl));
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден.");
        }
    }
}
