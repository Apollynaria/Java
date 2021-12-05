package com.company;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.util.*;

public class Main {

    /**
     * Метод для получения фамилии продавца по его id
     * @param id - номер продавца
     * @param sellers - список продавцов
     * @return возвращает фамилию продавца или "NotIdentify", если продавца нет
     */
    public static String getSellerSurname(int id, Seller[] sellers) {

        return Arrays.stream(sellers).filter(seller -> seller.getID() == id)
                .map(Seller::getSurname)
                .findFirst().orElse("NotIdentify");
    }

    /**
     * Метод для получения имени продавца по его id.
     * @param id - номер продавца
     * @param sellers - список продавцов
     * @return возвращает имя продавца или "unknown", если продавца нет
     */
    public static String getSellerName(int id, Seller[] sellers) {
        return Arrays.stream(sellers).filter(seller -> seller.getID() == id)
                .map(Seller::getName)
                .findFirst().orElse("NotIdentify");
    }

    /**
     * Метод, создающий продавца по id
     * @param id id продавца
     * @return объект класса Seller
     */
    public static Seller getSeller(int id, Seller[] sellers){
        return new Seller(id, getSellerName(id,sellers), getSellerSurname(id,sellers));
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Создаем reader для каждого входного файла
        JsonReader readerProduct = new JsonReader(new FileReader("in_Product.json"));
        JsonReader readerSale = new JsonReader(new FileReader("in_Sale.json"));
        JsonReader readerSeller = new JsonReader(new FileReader("in_Seller.json"));
        JsonReader readerSellerProduct = new JsonReader(new FileReader("in_SellerProduct.json"));

        //создаем инструкции для Gson
        Gson gson=new GsonBuilder().setPrettyPrinting().create();

        //Читаем данные с файлов в массивы данных
        Product[] products = gson.fromJson(readerProduct,Product[].class);
        Sale[] sales = gson.fromJson(readerSale,Sale[].class);
        Seller[] sellers = gson.fromJson(readerSeller,Seller[].class);
        SellerProduct[] sellerProducts = gson.fromJson(readerSellerProduct,SellerProduct[].class);

        //Задание 1
        //Для каждого товара вывести в файл продавца, у которого наименьшая цена на этот товар, и саму цену на этот товар у этого продавца
        Map<Integer, Map<Seller,Integer>> min_price = new HashMap<>();
        for (Product product : products) {
            //Получение id продукта
            int id_p = product.getID();
            //Поиск минимальной цены
            SellerProduct id = Arrays.stream(sellerProducts)
                    .filter(sellerProduct -> sellerProduct.getIdProduct() == id_p)
                    .min(Comparator.comparing(SellerProduct::getPrice)).get();
            //Создание Map из продавца и его цены
            Map<Seller, Integer> a = new HashMap<>();
            a.put(getSeller(id.getIdSeller(),sellers), id.getPrice());
            //Заполнение основного Map
            min_price.put(id_p,a);
        }
        //Вывод в файл
        try(Writer writer = new FileWriter("out1_min_price.json")) {
            gson.toJson(min_price,writer);
        }
        catch (IOException e){
            System.out.println("Не удается записать файл");
        }

        //Задание 2
        //Вывести в файл топ 5 дат, в которые было продано наибольшее количество товаров
        Map<String, Integer> top5 = new HashMap<>();
        for (Sale sale : sales) {
            // Дата продажи
            String date = sale.getDate();
            int value = 0;
            // Получение количества проданного товара
            if (top5.get(date) != null) {
                value = top5.get(date);
            }
            // Увеличение хранящегося количества
            top5.put(date, value + sale.getQuantity());
        }

        //Создание отсортированного HashMap
        LinkedHashMap<String, Integer> sorted_top5 = new LinkedHashMap<>();
        top5.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted_top5.put(x.getKey(), x.getValue()));

        //Вывод в файл
        try(Writer writer = new FileWriter("out2_top5.json")) {
            gson.toJson(sorted_top5,writer);
        }
        catch (IOException e){
            System.out.println("Не удается записать файл");
        }

    }
}
