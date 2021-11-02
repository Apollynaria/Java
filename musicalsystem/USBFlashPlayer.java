package musicalsystem;

/**
 * Класс для работы со звуковоспровоизводящим устройством - Флеш-плеер
 * @author Polly
 */
public class USBFlashPlayer extends RecordingDevice{
    /**
     * Метод, для воспроизведения композиции с Флеш-проигрывателя с носителя Флеш-накопитель
     * @param flash - носитель
     */
    public void play(USBFlashDrive flash){
        System.out.println("Текущее звуковоспровоизводящее устройство "+this);
        flash.getInfo();
    }
    
    /**
     * Метод, для воспроизведения следующей композиции с Флеш-проигрывателя с носителя Флеш-накопитель
     * @param flash - носитель
     */
    public void playNext(USBFlashDrive flash){
        flash.nextSong();
    }
    
    /**
     * Метод, для воспроизведения предыдущей композиции с Флеш-проигрывателя с носителя Флеш-накопитель
     * @param flash - носитель
     */
    public void playBack(USBFlashDrive flash){
        flash.backSong();
    }
    
    /**
     * Возвращает название звуковоспровоизводящего устройства
     * @return тип String
     */
    @Override
    public String toString(){
        return "\"Флеш-проигрыватель\"";
    }
}
