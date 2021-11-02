package musicalsystem;

/**
 * Класс носителя - CD player
 * @author Polly
 */
public class CD extends Carrier{
    
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, находящихся на устройстве.
     */
    public CD(Songs[] songs){
        super(songs);
    }
    
    /**
     * Возвращает название носителя
     * @return тип String.
     */
    @Override
    public String toString(){
       return "CD";
    }
    
}
