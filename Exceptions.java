package exceptions;

/**
 * Класс для тестирования ChessCoards
 * @author Polly
 */
public class Exceptions {

    public static void main(String[] args) {
        
        System.out.println("Тестирование конструктора объекта a");
        ChessCoards a = new ChessCoards(); //Конструктор по умолчанию
        System.out.println(a); //Вывод координаты по умолчанию
        System.out.println("("+a.getX()+","+a.getY()+")"); //Вывод координаты x и y в формате (0,0)
        try{
            a.setX(-1); //неверный ввод
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); //Выпало исключение
        }
        a.setX(3); //успешно
        a.setY(2); //успешно
        System.out.println(a);

        System.out.println("");
        System.out.println("Тестирование конструктора объекта b");
        try{
           ChessCoards b = new ChessCoards(8); //Конструктор от одного аргумента 
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); //Выпало исключение
        }
        ChessCoards b = new ChessCoards(7); //Корректный ввод
        System.out.println(b);
        System.out.println("");
        
        System.out.println("");
        System.out.println("Тестирование конструктора объекта c");
        try{
           ChessCoards c = new ChessCoards(-3,7); //Конструктор от двух аргументов 
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); //Выпало исключение
        }
        ChessCoards c = new ChessCoards(3,3); //Корректный ввод
        System.out.println(c);
        c.setX('b'); //Установим x значение b -> 1
        System.out.println(c.getX());
        System.out.println(c);
        System.out.println("");
        
        System.out.println("");
        System.out.println("Тестирование конструктора объекта d");
        try{
           ChessCoards d = new ChessCoards('y',5); //Конструктор от двух аргументов 
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); //Выпало исключение
        }
        ChessCoards d = new ChessCoards('e',5); //Корректный ввод
        System.out.println(d);
        try{
            d.setX('y'); //Установим x значение y
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); //Выпало исключение
        }

    }
    
}
