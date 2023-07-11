package com.raphael.static_keyword;

public class PhoneObject {
    public static void main(String[] args) {
        Phone phone = new Phone();
        // instance
        System.out.println(phone.brand);

        // static
        System.out.println(Phone.color);


    }
}
