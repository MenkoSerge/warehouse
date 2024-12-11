package com.sergemenko;

public class Producer implements Runnable {
    Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            warehouse.put();
        }
    }
}
