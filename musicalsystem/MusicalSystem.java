package musicalsystem;

/**
 * Класс, тестирующий музыкальную систему
 * @author Polly
 */
public class MusicalSystem {

    public static void main(String[] args) {
       //Массив для виниловой пластинки
       Songs []songVinyl = new Songs[4];
       songVinyl[0] = new Songs("Антонио Вивальди","Летняя гроза");
       songVinyl[1] = new Songs("Вольфганг Амадей Моцарт","Маленькая ночная серенада");
       songVinyl[2] = new Songs("Людвиг ван Бетховен","Симфония 5");
       songVinyl[3] = new Songs("Франц Шуберт","Аве Мария");
       
       //Песни для CD-диска
       Songs []songCD = new Songs[3];
       songCD[0] = new Songs("Darude","Sandstorm");
       songCD[1] = new Songs("Тони Раут","Карнавал");
       songCD[2] = new Songs("pyrokinesis","Днями-ночами");
       
       //Песни для флеш-накопителя
       Songs []songPC = new Songs[5];
       songPC[0] = new Songs("ATL","Танцуйте");
       songPC[1] = new Songs("ATL","Марабу");
       songPC[2] = new Songs("ATL","Серпантин");
       songPC[3] = new Songs("ATL","Браслеты");
       songPC[4] = new Songs("ATL","Астронавт");
       
       //Создание плееров
       CDplayer cdplayer = new CDplayer();
       VinylPlayer vinylplayer = new VinylPlayer();
       USBFlashPlayer flashplayer = new USBFlashPlayer();
       
       //Создание носителей
       CD cd = new CD(songCD);
       VinylRecord vinyl = new VinylRecord(songVinyl);
       USBFlashDrive pcFlash = new USBFlashDrive(songPC);
       
       //Проигрывание с CD
       cdplayer.play(cd);
       cdplayer.playBack(cd);
       cdplayer.playNext(cd);
       cdplayer.play(vinyl);
       
       System.out.println("");
       
       //Проигрывание с винилового проигрывателя
       vinylplayer.play(cd);
       vinylplayer.play(vinyl);
       vinylplayer.playNext(vinyl);
       vinylplayer.playNext(vinyl);
       vinylplayer.playNext(vinyl);
       vinylplayer.playNext(vinyl);
       
       System.out.println("");
       
       //Проигрывание с ПК(USBFlash)
       flashplayer.play(vinyl);
       flashplayer.play(pcFlash);
       flashplayer.playBack(pcFlash);
       flashplayer.playBack(pcFlash);
       flashplayer.playBack(vinyl);
    }
    
}
