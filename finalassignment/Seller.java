/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import java.util.Objects;

/**
 * Класс для работы с продавцами
 * @author Polly
 */
public class Seller {
    
    private int id;
    private String name;
    private String surname;
    
    /**
     * Конструктор по умолчанию
     */
    public Seller(){
        this.id = 0;
        this.name = "NotIdentify";
        this.surname = "NotIdentify";
    }
    
    /**
     * Конструктор от трех аргументов
     * @param _id id продавца
     * @param _name имя продавца
     * @param _surname фамилия продавца
     */
    public Seller(int _id,  String _name, String _surname){
        this.id = _id;
        this.name = _name;
        this.surname = _surname;
    }
    
    /**
     * Метод, устанавливающий id продавца
     * @param _id устанавливаемый id продавца
     */
    public void setID(int _id){
        this.id = _id;
    }
    
    /**
     * Метод, получающий информацию об id продавца
     * @return возвращает полученный id продавца
     */
    public int getID(){
        return this.id;
    }
    
    /**
     * Метод, устанавливающий имя продавца
     * @param name устанавливаемое имя продавца
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Метод, получающий информацию об имени продавца
     * @return возвращает полученное имя продавца
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Метод, устанавливающий фамилию продавца
     * @param surname устанавливаемая фамилия продавца
     */
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    /**
     * Метод, получающий информацию о фамилии продавца
     * @return возвращает полученную фамилию продавца
     */
    public String getSurname(){
        return this.surname;
    }
    
    /**
     * Метод для сравнивания объектов
     * @param obj сравнимаемый объект
     * @return результат сравнения
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Seller other = (Seller) obj;
        if (!this.getName().equals(other.getName()))
            return false;
        if (this.getID()!=other.getID())
            return false;
        return this.getSurname().equals(other.getSurname());
    }
    
    /**
     * Метод, для вывода информации о продавце в виде строки
     * @return строка с информацией о продавце
     */
    @Override
    public String toString(){
        return this.getID() + " - " + this.getName() + " - " + this.getSurname();
    }
    
    /**
     * Метод, возвращающий hasCode объекта класса
     * @return hashCode объекта класса
     */
    @Override
    public int hashCode(){
        return Objects.hash(this);
    }
}
