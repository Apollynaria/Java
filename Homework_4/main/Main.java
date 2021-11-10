package main;
import java.util.ArrayList;
import java.util.concurrent.*;
/**
 * Стартовый класс.
 */
public class Main {

    /**
     * Пример входной строки.
     */
    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
        " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой" +
        " не зависит ни от того, ни от другого. Поэтому мануфактуры лучше всего процветают там, где" +
        " наиболее подавлена духовная жизнь, так что мастерская может рассматриваться как машина," +
        " части которой составляют люди.";

    /**
     * Шаблон поиска символов в строке.
     */
    public static final String TEMPLATE = " ";

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки.
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException{

        long current = System.currentTimeMillis();
        
        int sum = 0;
        
        ExecutorService executor = Executors.newFixedThreadPool(INPUT_STRING.length()); //Пул из 16 потоков
        ArrayList<FutureTask> calls = new ArrayList<>(INPUT_STRING.length()); //Поступление в поток
        
        for (int i = 0; i < INPUT_STRING.length(); i++) {
            StringProc proc = new StringProc(String.valueOf(INPUT_STRING.charAt(i)), TEMPLATE);//создание объекта задачи
            calls.add(new FutureTask<>(proc)); //Добавление в список задачи 
            executor.submit(calls.get(i)); //Отдача задачи потоку
        }
        
        for (int i = 0; i < INPUT_STRING.length(); i++) {
            FutureTask<Integer> proc = calls.get(i); //выбор задачи 
            sum += proc.get(); //решение задачи
        }
        
        // Ожидание завершения задач и остановка потока
        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } 
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } 
        finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
        
        System.out.println("Count of space: " + sum);

        System.out.println("Time: " + (System.currentTimeMillis() - current) / 1000 + " c.");
    }
}