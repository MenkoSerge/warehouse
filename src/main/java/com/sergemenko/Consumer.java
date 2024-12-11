package com.sergemenko;

public class Consumer implements Runnable{
    Warehouse warehouse;
    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }



    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
        warehouse.get();
        }
    }
}
