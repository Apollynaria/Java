package musicalsystem;

/**
 * Класс для работы со звуковоспровоизводящим устройством - CD-плеер
 * @author Polly
 */
public class CDplayer extends RecordingDevice{

    /**
     * Метод для воспроизведения композиции с CD-плеера с носителя CD
     * @param cd - носитель
     */
    public void play(CD cd){
        System.out.println("Текущее звуковоспровоизводящее устройство "+this);
        cd.getInfo();
    }
    
    /**
     * Метод для воспроизведения следующей композиции с CD-плеера с носителя CD
     * @param cd  - носитель
     */
    public void playNext(CD cd){
        cd.nextSong();
    }
    
    /**
     * Метод для воспроизведения предыдущей композиции с CD-плеера с носителя CD
     * @param cd  - носитель
     */
    public void playBack(CD cd){
        cd.backSong();
    }
    
    /**
     * Возвращает название звуковоспровоизводящего устройства
     * @return тип String
     */
    @Override
    public String toString(){
        return "\"CD-плеер\"";
    }
}
