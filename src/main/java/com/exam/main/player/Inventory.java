package com.exam.main.player;

import com.exam.main.items.Item;
import com.exam.main.items.basic_item.Branch;

import java.util.*;

public class Inventory {
//    private List<Item> items;
    private Map<String, Item> items;

    public Inventory(Map<String, Item> items) {
        this.items = items;
    }

    public Inventory() {
        items = new HashMap<>();
        items.put("ветка", new Branch());
        items.put("stone", new Branch());
        items.put("grass", new Branch());
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void setItems(Map<String, Item> items) {
        this.items = items;
    }

    public void putItem(String nameItem){
        Item item = items.get(nameItem);
        item.addItem();
        System.out.println("Игрок нашел предмет: " + nameItem + " и положил его в инвертарь");
        System.out.println("Всего " + nameItem + ": " + item.getCount());
    }
}
