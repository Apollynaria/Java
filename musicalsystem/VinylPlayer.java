package musicalsystem;

/**
 * Класс для работы со звуковоспровоизводящим устройством - Виниловый проигрыватель
 * @author Polly
 */
public class VinylPlayer extends RecordingDevice{
    /**
     * Метод, для воспроизведения композиции с Винолового проигрывателя с носителя Виниловая пластинка
     * @param vinyl - носитель
     */
    public void play(VinylRecord vinyl){
        System.out.println("Текущее звуковоспровоизводящее устройство "+this);
        vinyl.getInfo();
    }
    
    /**
     * Метод, для воспроизведения следующей композиции с Винолового проигрывателя с носителя Виниловая пластинка
     * @param vinyl - носитель
     */
    public void playNext(VinylRecord vinyl){
        vinyl.nextSong();
    }
    
    /**
     * Метод, для воспроизведения предыдущей композиции с Винолового проигрывателя с носителя Виниловая пластинка
     * @param vinyl - носитель
     */
    public void playBack(VinylRecord vinyl){
        vinyl.backSong();
    }
    
    /**
     * Возвращает название звуковоспровоизводящего устройства
     * @return тип String
     */
    @Override
    public String toString(){
        return "\"Виниловый проигрыватель\"";
    }
}
