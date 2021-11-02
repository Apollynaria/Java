package musicalsystem;

/**
 * Класс носителя - Флеш накопитель
 * @author Polly
 */
public class USBFlashDrive extends Carrier{
    
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, находящихся на устройстве.
     */
    public USBFlashDrive(Songs[] songs){
        super(songs);
    }
    
    /**
     * Возвращает название носителя
     * @return тип String.
     */
    @Override
    public String toString(){
       return "Флеш-накопитель";
    }
}
