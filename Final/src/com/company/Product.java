package com.company;

import java.util.Objects;

public class Product {
    private int id;
    private String name;

    /**
     * Конструктор по умолчанию
     */
    public Product(){
        this.id = 0;
        this.name = "NotIdentify";
    }

    /**
     * Конструктор от двух аргументов
     * @param _id id товара
     * @param _name имя товара
     */
    public Product(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    /**
     * Метод, устанавливающий id товара
     * @param _id устанавливаемый id товара
     */
    public void setID(int _id){
        this.id = _id;
    }

    /**
     * Метод, получающий информацию об id товара
     * @return возвращает полученный id товара
     */
    public int getID(){
        return this.id;
    }

    /**
     * Метод, устанавливающий имя товара
     * @param name устанавливаемое имя товара
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Метод, получающий информацию об имени товара
     * @return возвращает полученное имя
     */
    public String getName(){
        return this.name;
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
        Product other = (Product) obj;
        if (!this.getName().equals(other.getName()))
            return false;
        return this.getID() == other.getID();
    }

    /**
     * Метод, для вывода информации о товаре в виде строки
     * @return строка с информацией о товаре
     */
    @Override
    public String toString(){
        return this.getID() + " - " + this.getName();
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
