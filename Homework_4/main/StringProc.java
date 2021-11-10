package main;

import java.util.concurrent.*;

/**
 * Класс обрабатывающий строку
 * @author Polly
 */
public class StringProc implements Callable<Integer>{
    private final String S; //Строка
    private final String TEMPLATE; //Символ
    
    /**
     * Конструктор от двух параметров
     * @param another_S обрабатываемая строка
     * @param another_TEMPLATE обрабатываемый символ
     */
    public StringProc(String another_S, String another_TEMPLATE){
        this.S = another_S;
        this.TEMPLATE = another_TEMPLATE;
    }
    
    /**
     * Переопределенный метод, высчитывающий результат и в зависимости от результата выбрасывает исключение
     * @return возвращает 1 если символ найден, 0 если символ не найден
     */
    public Integer call() throws Exception {
        if (Matcher.match(S, TEMPLATE)) {
            return 1;
        } else {
            return 0;
        }
    }
}
