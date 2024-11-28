package org.example;

import org.example.hw2.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Rectangle rec = new Rectangle(4,2);
        System.out.println(rec.calculateArea());
        System.out.println(rec.calculatePerimeter());
        System.out.println(rec.getHeight());


//        BankAccount acc = new BankAccount(123, 44.4);
//        System.out.println(acc.getBalance());
//        acc.deposit(88.9);
//        System.out.println(acc.getBalance());
//        acc.deposit(-999.00);
//        acc.withdraw(8.2);
//        System.out.println(acc.getBalance());

//        Item item = new Item("Chocolate Cookies", 5.55, 1);
//        System.out.println(item.getInfo());
//        item.restock(5);
//        item.restock(4);
//        System.out.println(item.getInfo());
//        item.sell(10);
//        System.out.println(item.getInfo());

//
//        Person person1 = new Person("Иван", 30, "мужчина", "Москва");
//        Person person2 = new Person("Иван", 30, "мужчина", "Санкт-Петербург");
//
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getGender());
//        System.out.println(person1.getCity());
//        System.out.println(person1.equals(person2));
    }
}