package org.example.hw2;

//Методы:
//sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
//restock(int amount): добавляет указанное количество на склад.
//getInfo(): возвращает строку с информацией о товаре.
public class Item {
    private final String name;
    private final double price;
    private Integer quantity;

    Item(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(Integer amount) {
        if (amount < 0) {
            System.out.println("Sell amount must be > 0");
        }
        if (quantity >= amount) {
            quantity = quantity - amount;
        }
    }

    public void restock(Integer amount) {
        if (amount <= 0) {
            System.out.println("Restock amount must be >= 0");
        } else {
            quantity = quantity + amount;
        }
    }

    public String getInfo() {
        return "Product name: " + name + ", product price: " + price + ", product amount: " + quantity;
    }
}
