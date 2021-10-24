package musicalsystem;

/**
 * Класс для работы с песнями
 * @author Polly
 */
public class Songs {
    //свойства
    private String NameSong;
    private String AuthorSong;
    
    /**
     * Конструктор по умолчанию
     */
    public Songs(){
        this.AuthorSong = "notIdentified";
        this.NameSong = "notIdentified";
    }
    
    /**
     * Конструктор от двух аргументов
     * @param Sname название песни
     * @param Author автор песни
     */
    public Songs(String Sname, String Author){
        this.AuthorSong = Author;
        this.NameSong = Sname;
    }
    
    /**
     * Метод, для получения названия песни
     * @return возвращает название песни
     */
    public String getNameSong(){
        return this.NameSong;
    }
    
    /**
     * Метод, для получения автора песни
     * @return возвращает имя автора песни
     */
    public String getAuthor(){
        return this.AuthorSong;
    }
    
    /**
     * Метод, устанавливающий имя песни
     * @param newName - устанавливаемое значение
     */
    public void setNameSong(String newName){
        this.NameSong = newName;
    }
    
    /**
     * Метод, устанавливающий имя песни
     * @param newAuthor - устанавливаемое значение
     */
    public void setAuthor(String newAuthor){
        this.AuthorSong = newAuthor;
    }
    
    /**
     * Метод для сравнения песен
     * @param obj сравниваемая песня
     * @return возвращает тип boolean, равны объекты или нет
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
        Songs other = (Songs) obj;
        if (this.getAuthor() != other.getAuthor()){
            return false;
        }
        if (this.getNameSong() != other.getNameSong()){
            return false;
        }
        return true;
    }
    
    /**
     * Метод, возвращающий информацию о песне в виде строки
     * @return возвращает тип String, автор песни - название песни
     */
    public String toString(){
        return String.format("%s - %s",this.NameSong,this.AuthorSong);
    }
    
}
