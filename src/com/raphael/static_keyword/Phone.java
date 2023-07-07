package com.raphael.static_keyword;

public class Phone {

    static String color = "Grey";
    String brand = "Samsung";

    public static void main(String[] args) {
        System.out.println(color);
//        System.out.println(brand); does not work
        Phone phone = new Phone();
        System.out.println(phone.brand);
    }
}
