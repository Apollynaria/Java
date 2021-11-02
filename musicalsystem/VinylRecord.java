package musicalsystem;

/**
 * Класс носителя - Виниловая пластинка
 * @author Polly
 */
public class VinylRecord extends Carrier{
    
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, находящихся на устройстве.
     */
    public VinylRecord(Songs[] songs){
        super(songs);
    }
    
    /**
     * Возвращает название носителя
     * @return тип String.
     */
    @Override
    public String toString(){
       return "Виниловая пластинка";
    }
}
