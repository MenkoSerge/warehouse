package com.sergemenko;


public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);
        new Thread( producer).start();
        new Thread( consumer).start();
    }
}