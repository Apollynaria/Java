package musicalsystem;

/**
 * Класс для работы с носителями
 * @author Polly
 */
public class Carrier {
    //свойства
    String NameCarrier;
    Songs songs[];
    
    /**
     * Конструктор по умолчанию
     */
    public Carrier(){
        this.NameCarrier = "notIdentified";
        this.songs[0] = new Songs();
    }
    
    /**
     * Конструктор от одного аргумента
     * @param Cname - название носителя
     */
    public Carrier(String Cname, Songs[] songs){
        this.NameCarrier = Cname;
        this.songs = songs;
    }
    
    /**
     * Метод, для получения названия носителя
     * @return возвращает название носителя
     */
    public String getCarrier(){
        return this.NameCarrier;
    }
    
    /**
     * Метод, устанавливающий имя носителя
     * @param newName - устанавливаемое значение
     */
    public void setCarrier(String newName){
        this.NameCarrier = newName;
    }
    
    /**
     * Метод для сравнения носителей
     * @param obj - сравниваемый носитель
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
        Carrier other = (Carrier) obj;
        if (this.getCarrier() != other.getCarrier()){
            return false;
        }  
        return true;
    }
    
    /**
     * Метод, возвращающий информацию о носителе в виде строки
     * @return возвращает тип String, имя носителя
     */
    public String toString(){
        return String.format("%s",this.NameCarrier);
    }
    
}
