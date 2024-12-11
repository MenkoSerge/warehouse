package com.sergemenko;


public class Warehouse {
    private int product =0;
    public synchronized void get(){
        while (product<1 ){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("1 package is gone");
        System.out.println("Warehouse stock: " + this.product);
        notify();
    }
    public synchronized void put(){
        while (product>=3 ){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("add new package");
        System.out.println("Warehouse stock: " + this.product);
        notify();
    }
}
