package com.exam.main.player;

import com.exam.main.items.Item;
import com.exam.main.items.basic_item.Branch;
import javafx.scene.control.TextArea;

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

    public void putItem(String nameItem, TextArea dialogView){
        Item item = items.get(nameItem);
        item.addItem();
        dialogView.appendText("Игрок нашел предмет: " + nameItem + " и положил его в инвертарь\n");
        dialogView.appendText("Всего " + nameItem + ": " + item.getCount() + "\n");
//        System.out.println("Игрок нашел предмет: " + nameItem + " и положил его в инвертарь");
//        System.out.println("Всего " + nameItem + ": " + item.getCount());
    }
}
