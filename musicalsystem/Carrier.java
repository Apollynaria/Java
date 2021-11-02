package musicalsystem;

import java.util.Arrays;
import java.util.Objects;

/**
 * Абстрактный класс для работы с носителями
 * @author Polly
 */
public abstract class Carrier {
    private Songs songs[];
    private int idSong = 0;
    
    /**
     * Конструктор по умолчанию
     */
    public Carrier(){
        this.songs[0] = new Songs();
    }
    
    /**
     * Конструктор от одного аргумента
     * @param songs - массив песен
     */
    public Carrier(Songs[] songs){
        this.songs = songs;
    }
    
    /**
     * Метод, возвращающий все песни, находящиеся на устройстве.
     * @return массив песен Songs
     */
    public Songs[] getSongs(){
        return this.songs;
    }
    
    /**
     * Метод для получения информации о текущей проигрываемой композиции
     */
    public void getInfo(){
        System.out.println("Текущая композиция: ["+(idSong+1)+"] "+songs[idSong]);
    }
    
    /**
     * Метод, для переключения на следующую композицию и выведения информации
     */
    public void nextSong(){
        idSong++;
        if(idSong > songs.length - 1){
            idSong = 0;
        }
        getInfo();
    }
    
    /**
     * Метод, для переключения на предыдущую композицию и выведения информации
     */
    public void backSong(){
        idSong--;
        if(idSong < 0){
            idSong = songs.length - 1;
        }
        getInfo();
    }
    
    /**
     * Метод для сравнения носителей
     * @param obj - сравниваемый носитель
     * @return - результат сравнения
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }        
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Carrier)) {
            return false;
        }
        Carrier other = (Carrier) obj;
        if (!Arrays.equals(this.getSongs(), other.getSongs())){
            return false;
        }  
        return true;
    }
    
    /**
     * Метод, возвращающий информацию о носителе в виде строки
     */
    @Override
    public String toString(){
        return String.format("Музыкальный носитель.");
    }
    
    /**
     * Метод, возвращающий hasCode объекта класса
     * @return 
     */
    @Override
    public int hashCode(){
        return Objects.hash(this);
    }
}
