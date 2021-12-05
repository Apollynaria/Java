package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Sale {
    private int idSale;
    private int idSeller;
    private int idProduct;
    private int quantity;
    private String date;

    /**
     * Конструктор от пяти аргументов
     * @param _idSeller id продавца
     * @param _idSale id продажи
     * @param _idProduct id товара
     * @param _quantity количество проданных товаров
     * @param _date дата продажи
     */
    public Sale(int _idSeller, int _idSale, int _idProduct, int _quantity, String _date){
        this.idSeller = _idSeller;
        this.idSale = _idSale;
        this.idProduct = _idProduct;
        this.quantity = _quantity;
        this.date = _date;
    }

    /**
     * Конструктор по умолчанию
     */
    public Sale(){
        this.idSeller = 0;
        this.idSale = 0;
        this.idProduct = 0;
        this.quantity = 0;
        this.date = "01-01-1900";
    }

    /**
     * Метод, устанавливающий id продавца
     * @param _idSeller устанавливаемый id продавца
     */
    public void setIdSeller(int _idSeller){
        this.idSeller = _idSeller;
    }

    /**
     * Метод, получающий информацию об id продавца
     * @return возвращает полученный id продавца
     */
    public int getIdSeller(){
        return this.idSeller;
    }

    /**
     * Метод, устанавливающий id продажи
     * @param _idSale устанавливаемый id продажи
     */
    public void setIdSale(int _idSale){
        this.idSale = _idSale;
    }

    /**
     * Метод, получающий информацию об id продажи
     * @return возвращает полученный id продажи
     */
    public int getIdSale(){
        return this.idSale;
    }

    /**
     * Метод, устанавливающий id продукта
     * @param _idProduct устанавливаемый id продукта
     */
    public void setIdProduct(int _idProduct){
        this.idProduct = _idProduct;
    }

    /**
     * Метод, получающий информацию об id продукта
     * @return возвращает полученный id продукта
     */
    public int getIdProduct(){
        return this.idProduct;
    }

    /**
     * Метод, устанавливающий количество проданных товаров
     * @param _quantity устанавливаемое количество проданных товаров
     */
    public void setQuantity(int _quantity){
        this.quantity = _quantity;
    }

    /**
     * Метод, получающий информацию о количестве проданных товаров
     * @return возвращает полученное количество проданных товаров
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Метод, устанавливающий дату продажи
     * @param _date устанавливаемая дата продажи
     */
    public void setDate(String _date){
        this.date = _date;
    }

    /**
     * Метод, получающий информацию о дате продажи
     * @return возвращает полученную дату продажи
     */
    public String getDate(){
        return this.date;
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
        Sale other = (Sale) obj;
        if (this.quantity!=other.getQuantity())
            return false;
        if (this.getIdSale()!=other.getIdSale())
            return false;
        if (this.getIdSeller()!=other.getIdSeller())
            return false;
        if (this.getIdProduct()!=other.getIdProduct())
            return false;
        return this.getDate().equals(other.getDate());
    }

    /**
     * Метод, для вывода информации о продавце в виде строки
     * @return строка с информацией о продавце
     */
    @Override
    public String toString(){
        return String.format("id Sale - %d%nid Seller - %d%nid Product - %d%nQuantity - %d%nDate - %s%n", this.idSale, this.idSeller, this.idProduct, this.quantity, this.date);
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
