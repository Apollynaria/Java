package com.company;

import java.util.Objects;

public class SellerProduct {

    private int idSeller;
    private int idProduct;
    private int price;
    private int quantity;

    /**
     * Конструктор по умолчанию
     */
    public SellerProduct(){
        this.idSeller = 0;
        this.idProduct = 0;
        this.price = 0;
        this.quantity = 0;
    }

    /**
     * Конструктор от четырех аргументов
     * @param _idSeller id продавца
     * @param _idProduct id продажи
     * @param _price цена товара
     * @param _quantity количество товара в наличии у продавца
     */
    public SellerProduct(int _idSeller, int _idProduct, int _price, int _quantity){
        this.idSeller = _idSeller;
        this.idProduct = _idProduct;
        this.price = _price;
        this.quantity = _quantity;
    }

    /**
     * Метод, устанавливающий id продавца
     * @param _idSeller устанавливаемый id продавца
     */
    public void setIdSeller(int _idSeller){
        this.idSeller=_idSeller;
    }

    /**
     * Метод, получающий информацию об id продавца
     * @return возвращает полученный id продавца
     */
    public int getIdSeller(){
        return idSeller;
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
     * Метод, устанавливающий цену продукта
     * @param _price устанавливаемая цена продукта
     */
    public void setPrice(int _price){
        this.price = _price;
    }

    /**
     * Метод, получающий информацию о цене продукта
     * @return возвращает полученную цену продукта
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * Метод, получающий информацию о количестве продукта у продавца
     * @param _quantity устанавливаемое количество продукта у продавца
     */
    public void setQuantity(int _quantity){
        this.quantity = _quantity;
    }

    /**
     * Метод, получающий информацию о количестве продукта у продавца
     * @return возвращает  количество продукта у продавца
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Метод, для вывода информации о продавце в виде строки
     * @return строка с информацией о продавце
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        SellerProduct other = (SellerProduct) obj;
        if (this.getPrice()!=other.getPrice())
            return false;
        if (this.getIdProduct()!=other.getIdProduct())
            return false;
        if (this.getIdSeller()!=other.getIdSeller())
            return false;
        return this.getQuantity() == other.getQuantity();
    }

    /**
     * Метод, для вывода информации по наличию товара у продавца
     * @return строка с информацией по наличию товара у продавца
     */
    @Override
    public String toString(){
        return this.idSeller + " - " + this.idProduct + " - " + this.price + " - " + this.quantity;
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
