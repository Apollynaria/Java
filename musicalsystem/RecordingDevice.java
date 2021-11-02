package musicalsystem;

/**
 * Класс для работы со звуковоспровоизводящими устройствами
 * @author Polly
 */
public abstract class RecordingDevice {
    /**
     * Конструктор по умолчанию
     */
    public RecordingDevice(){
        
    }
    
    /**
     * Метод, проигрывающий музыку со звуковоспровоизводящего устройства
     * @param carrier - звуковоспровоизводящее устройство
     */
    public void play(Carrier carrier){
        System.out.printf("Невозможно воспроизвести песню.%n");
    }
    
    /**
     * Метод, для переключения на следующую композицию со звуковоспровоизводящего устройства
     * @param carrier - звуковоспровоизводящее устройство
     */
    public void playNext(Carrier carrier){
        System.out.printf("Невозможно переключить песню.%n");
    }
    
    /**
     * Метод, для переключения на предыдущую композицию со звуковоспровоизводящего устройства
     * @param carrier - звуковоспровоизводящее устройство
     */
    public void playBack(Carrier carrier){
        System.out.printf("Невозможно переключить песню.%n");
    }
    
    /**
     * Метод, возвращающий информацию об устройстве в виде строки
     * @return возвращает тип String, имя устройства
     */
    public String toString(){
        return String.format("Звуковоспровоизводящее устройство");
    }
    
}
