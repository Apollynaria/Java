package exceptions;

import java.util.Objects;

/**
 * Класс, описывающий координаты шахматной клетки
 * @author Polly
 */
public class ChessCoards {
    //свойства
    private int x;
    private int y;
    
    /**
     * Конструктор по умолчанию
     * Координаты клетки (0,0)
     */
    public ChessCoards(){
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Конструктор от одного аргумента
     * @param a координата клетки по оси x и y (тип int)
     */
    public ChessCoards(int a) throws IllegalArgumentException{
        if (a >= 0 && a <= 7){
            this.x = a;
            this.y = a;
        }
        else {
            throw new IllegalArgumentException("Неверная координата. Введите координату от 0 до 7");
        }
    }
    /**
     * Конструктор от двух аргументов x и y
     * @param x координата клетки по оси x (тип int)
     * @param y координата клетки по оси y (тип int)
     */
    public ChessCoards(int x, int y) throws IllegalArgumentException{
        if ( (x >= 0 && x <= 7) && (y >= 0 && y <= 7) ){
            this.x = x;
            this.y = y;
        }
        else {
            throw new IllegalArgumentException("Неверные координаты. Введите координаты от 0 до 7");
        }
    }
    
    /**
     * Конструктор от двух аргументов x и y
     * @param x координата клетки по оси x (тип char)
     * @param y координата клетки по оси y (тип int)
     */
    public ChessCoards(char x, int y) throws IllegalArgumentException{
        if ( (x >= 'a' && x <= 'h') && (y >= 0 && y <= 7) ){
            this.x = x-97; //перевод из char в int координату
            this.y = y;
        }
        else {
            throw new IllegalArgumentException("Неверная координата. Введите координату от a до h для x и от 0 до 7 для y");
        }
    }
    
    /**
     * Метод, для получение координаты по оси x
     * @return тип int, координата по оси x
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Метод, для получение координаты по оси y
     * @return тип int, координата по оси y
     */
    public int getY() throws IllegalArgumentException{
        return this.y;
    }
    
    /**
     * Метод, устанавливающий координату по оси x
     * @param x тип int, устанавливаемый параметр
     * @throws IllegalArgumentException - исключение, в случае некорректно введенного значения
     */
    public void setX(int x) throws IllegalArgumentException{
        if (x >= 0 && x <= 7){
            this.x = x;
        }
        else {
            throw new IllegalArgumentException("Неверная координата. Введите координату от 0 до 7");
        }
    }
    
    /**
     * Метод, устанавливающий координату по оси x в буквенном виде
     * @param x тип char, устанавливаемый параметр
     * @throws IllegalArgumentException - исключение, в случае некорректно введенного значения
     */
    public void setX(char x) throws IllegalArgumentException{
        if (x >= 'a' && x <= 'h') {
            this.x = x-97; //перевод из char в int координату
        }
        else {
            throw new IllegalArgumentException("Неверная координата. Введите координату от a до h");
        }
    }
    
    /**
     * Метод, устанавливающий координату по оси y
     * @param y тип int, устанавливаемый параметр
     * @throws IllegalArgumentException - исключение, в случае некорректно введенного значения
     */
    public void setY(int y) throws IllegalArgumentException{
        if (y >= 0 && y <= 7) {
            this.y = y;
        }
        else {
            throw new IllegalArgumentException("Неверная координата. Введите координату от 0 до 7");
        }
    }
    
    /**
     * Метод для вывода координаты клетки в формате номер колонки в виде буквы от 'a' до 'h', номер строки, начиная с 1
     * @return тип String, координата клетки
     */
    public String toString(){
        return String.format("<%c><%d>", 'a'+this.x, this.y);
    }
    
    /**
     * Метод для сравнения объектов класса
     * @param obj сравниваемая координата
     * @return возвращает тип boolean, равны объекты или нет
     */
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } 
        if (obj == null){
            return false;
        }
        if (!(obj instanceof ChessCoards)) {
            return false;
        }
        ChessCoards other = (ChessCoards) obj;
        if ( (this.getX() != other.getX()) || (this.getY() != other.getY()) ){
            return false;
        }
        return true;
    }
    
    /**
     * Метод, возвращающий hasCode объекта класса
     * @return возвращает hasCode объекта
     */
    public int hashCode(){
        return Objects.hash(this);
    }
}
