package com.badorek.viikko_11_muisti_app;

import java.util.ArrayList;

public class Storage {
    ArrayList<Item> items = new ArrayList<>();

    private static Storage itemStorage = null;

    public Storage(){

    }

    public static Storage getInstance() {
        if(itemStorage == null){
            itemStorage = new Storage();
        }
        return itemStorage;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
