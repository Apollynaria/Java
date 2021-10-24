package musicalsystem;

/**
 * Класс для работы со звуковоспровоизводящими устройствами
 * @author Polly
 */
public class RecordingDevice {
    //Свойства
    private String NameDevice;  
    private boolean condition = false;
    final Carrier carrier;
    final String carrierP;
    private int NumSong = 0;
  
    /**
     * Конструктор по умолчанию
     */
    public RecordingDevice(){
        this.NameDevice = "notIdentified";
        this.carrier = new Carrier();
        this.carrierP = this.carrier.NameCarrier;
    }
    
    /**
     * Конструктор от трех аргументов
     * @param NameD название звуковоспровоизводящего устройства
     * @param carrierP носитель проигрывателя
     * @param carrierD пользовательский носитель
     */
    public RecordingDevice(String NameD, String carrierP, Carrier carrierD){
        this.NameDevice = NameD;
        this.carrier = carrierD;
        this.carrierP = carrierP;
    }
    
    /**
     * Метод для получения текущего состояния звуковоспровоизводящего устройства
     * @return true - устройство включено, false - устройство выключено
     */
    public boolean getCondition(){
        return this.condition;
    }
    
    /**
     * Метод, устанавливающий состояние звуковоспровоизводящего устройства
     * @param setter true - включить устройство, false - выключить устройство
     */
    public void setCondition(boolean setter){
        this.condition = setter;
    }
    
    /**
     * Метод, для получения названия звуковоспровоизводящего устройства
     * @return возвращает название устройства
     */
    public String getDevice(){
        return this.NameDevice;
    }
    
    /**
     * Метод, устанавливающий имя звуковоспровоизводящего устройства
     * @param newName - устанавливаемое значение
     */
    public void setDevice(String newName){
        this.NameDevice = newName;
    }
    
    /**
     * Метод, проигрывающий музыку со звуковоспровоизводящего устройства
     */
    public void playSongs(){
        if(!this.condition){
            System.out.printf("Устройство \"%s\" выключено.%n", NameDevice);
        }
        else if(!this.carrier.NameCarrier.equals(this.carrierP)){
            System.out.printf("Данный носитель не подходит к выбранному устройству.%n");
        }
        else{
            if(this.NumSong == this.carrier.songs.length){
                this.NumSong = 0;
            }
            System.out.printf("Управление устройством \"%s\": play(\"next\") - следующая композиция ~~~~~~~~~~~ play(\"back\") - предыдущая композиция%n",this.NameDevice);
            System.out.printf("Устройство \"%s\", ",this.NameDevice);
            System.out.printf("носитель \"%s\", ",this.carrier);
            System.out.printf("сейчас воспроизводится %d из %d: %s%n",this.NumSong+1,this.carrier.songs.length,this.carrier.songs[this.NumSong]);
        } 
    }
    
    /**
     * Метод, проигрывающий следующую или предыдущую композицию со звуковоспровоизводящего устройства
     * @param control "next" - следующая композиция, "back" - предыдущая композиция, другое - текущая композиция
     */
    public void playSongs(String control){
        if(!this.condition){
            System.out.printf("Устройство \"%s\" выключено.%n", NameDevice);
        }
        else if(!this.carrier.NameCarrier.equals(this.carrierP)){
            System.out.printf("Данный носитель не подходит к выбранному устройству.%n");
        }
        else{ 
        if(control == "next"){
            if(this.NumSong == this.carrier.songs.length-1){
                this.NumSong = 0;
            }
            else{
                this.NumSong++;
            }
            System.out.println("Следующая композиция...");
        }
        else if(control == "back"){
            if(this.NumSong == 0){
                this.NumSong = this.carrier.songs.length-1;
            } 
            else{
                this.NumSong--;
            }
            System.out.println("Предыдущая композиция...");
        }
        else{
            System.out.printf("Введите next или back для переключения между песнями.");
        }
        System.out.printf("Устройство \"%s\", ",this.NameDevice);
        System.out.printf("носитель \"%s\", ",this.carrier);
        System.out.printf("сейчас воспроизводится %d из %d: %s%n",this.NumSong+1,this.carrier.songs.length,this.carrier.songs[this.NumSong]);
        }
    }
    
    /**
     * Метод для сравнения устройств
     * @param obj - сравниваемое устройство
     * @return - результат сравнения
     */
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }    
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        } 
        RecordingDevice other = (RecordingDevice) obj;
        if (this.getDevice() != other.getDevice()){
            return false;
        }   
        return true;
    }
    
    /**
     * Метод, возвращающий информацию о устройстве в виде строки
     * @return возвращает тип String, имя устройства
     */
    public String toString(){
        return String.format("%s",this.NameDevice);
    }
    
}
