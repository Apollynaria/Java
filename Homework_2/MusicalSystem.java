package musicalsystem;

/**
 * Класс, тестирующий музыкальную систему
 * @author Polly
 */
public class MusicalSystem {

    public static void main(String[] args) {
       Songs []songTurnable = new Songs[4];
       songTurnable[0] = new Songs("Антонио Вивальди","Летняя гроза");
       songTurnable[1] = new Songs("Вольфганг Амадей Моцарт","Маленькая ночная серенада");
       songTurnable[2] = new Songs("Людвиг ван Бетховен","Симфония 5");
       songTurnable[3] = new Songs("Франц Шуберт","Аве Мария");
       
       Songs []songCD = new Songs[3];
       songCD[0] = new Songs("Darude","Sandstorm");
       songCD[1] = new Songs("Тони Раут","Карнавал");
       songCD[2] = new Songs("pyrokinesis","Днями-ночами");
       
       Songs []songPC = new Songs[5];
       songPC[0] = new Songs("ATL","Танцуйте");
       songPC[1] = new Songs("ATL","Марабу");
       songPC[2] = new Songs("ATL","Серпантин");
       songPC[3] = new Songs("ATL","Браслеты");
       songPC[4] = new Songs("ATL","Астронавт");
       
       Carrier record = new Carrier("Пластинка", songTurnable);
       Carrier cd = new Carrier("CD", songCD);
       Carrier usb = new Carrier("USB", songPC);
       
       RecordingDevice turnable = new RecordingDevice("Виниловая вертушка","Пластинка",record);
       turnable.playSongs();
       turnable.setCondition(true);
       turnable.playSongs();
       turnable.playSongs("next");
       turnable.playSongs("back");
       turnable.setCondition(false);      
       
       System.out.println();
        
       RecordingDevice CDplayer1 = new RecordingDevice("CD-player","CD",record);
       
       System.out.println();
       
       RecordingDevice CDplayer = new RecordingDevice("CD-player","CD",cd);
       CDplayer.playSongs();
       CDplayer.setCondition(true);
       CDplayer.playSongs();
       CDplayer.playSongs("back");
       CDplayer.playSongs("back");
       CDplayer.playSongs("next");
       CDplayer.setCondition(false);
       CDplayer.playSongs();
       
       System.out.println();
       
       RecordingDevice PC = new RecordingDevice("Персональный компьютер","USB",usb);
       PC.playSongs();
       PC.setCondition(true);
       PC.playSongs();
       PC.playSongs("back");
       PC.playSongs("next");
       PC.playSongs("next");
       PC.playSongs("next");
       PC.playSongs("next");
       PC.playSongs("next");            
       PC.setCondition(false);
       
    }
    
}
