package iohomework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс для работы со словами в тексте
 * @author Polly
 */
public class CheckWords {
    
    /**
     * Метод для получения количества слов
     * @param fl имя файла
     * @return количество слов
     * @throws IOException 
     */
    int getSumWords(File fl) throws IOException{
        int ans = 0;
        Scanner F = new Scanner(fl);
            while(F.hasNext()){
                String tmp = F.next();
                tmp = tmp.replaceAll("[^A-Za-zА-Яа-я0-9]", ""); //Удаляет из подстроки все символы, кроме букв и цифр
                if(!"".equals(tmp)){ //не добавится, если это не слово или не буква
                    ans++;
                }
            }
        return ans;
    }
}
