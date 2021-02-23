package com.exam.main.player;

import com.exam.main.MainController;
import com.exam.main.MyEnum;
import com.exam.main.items.basic_item.Branch;
import com.exam.main.items.basic_item.Grass;
import com.exam.main.items.Item;
import com.exam.main.items.basic_item.Stone;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javafx.scene.control.TextArea;

public class Player {
    private String name;
    private int health;
    private List<Item> items;
//    private Map<String, List<Item>> inventory;
    private Inventory inventory;

    public Player(String name, int health, List<Item> items, TextArea dialogView) {
        this.name = name;
        this.health = health;
        this.items = items;
        this.inventory = new Inventory();
        playerWasBorn();
    }

    public Player(String name) {
        this.health = 100;
        this.name = name;
        this.items = new ArrayList<>();
        this.inventory = new Inventory();
        playerWasBorn();
    }

    public Player() {
        this.health = 100;
        this.name = "Player";
        this.items = new ArrayList<>();
        this.inventory = new Inventory();
        playerWasBorn();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void playerWasBorn() {
        System.out.println("Игрок: " + name + " был создан");
    }

    public void findItems(TextArea dialogView){
//        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(randomNumberWithMinMax(2, 5));
//            switch (randomNumberWithMinMax(1,4)){
//                case 1 :
//                    System.out.println(name +  " нашел камень");
//                    System.out.println("Всего камней в инвертаре");
//                    inventory.putItem();
//                    items.add(new Stone());
//                    break;
//                case 2 :
//                    System.out.println(name +  " нашел траву");
//                    System.out.println("Всего травы в инвертаре");
//                    items.add(new Grass());
//                    break;
//                case 3:
//                    System.out.println(name +  " нашел ветки, что-бы совать себе в задницу");
//                    System.out.println("Всего веток в заднице");
//                    items.add(new Branch());
//                    break;
//                default:
//                    System.out.println( name + " ничего не нашел, потому что пидр!!!");
//            }
            switch (randomNumberWithMinMax(1,4)){
                case 1 :
                    inventory.putItem("ветка", dialogView);
//                    dialogView.appendText(name + " нашел предмет: " + "ветка" + " и положил его в инвертарь");
                    break;
                case 2 :
                    inventory.putItem("grass", dialogView);
//                    dialogView.appendText(name + " нашел предмет: " + "grass" + " и положил его в инвертарь");
                    break;
                case 3:
                    inventory.putItem("stone", dialogView);
//                    dialogView.appendText(name + " нашел предмет: " + "stone" + " и положил его в инвертарь");

                    break;
                default:
//                    System.out.println( name + " ничего не нашел, потому что пидр!!!");
                    dialogView.appendText(name + " ничего не нашел, потому что пидр!!!\n");
//                    dialogView.appendText(name + " ничего не нашел, потому что пидр!!!");
                    break;
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
//            System.out.println("Звершили добычу");
            dialogView.appendText("Добыча ресурсов завершена\n");
        }
    }

    public void doSomething(){
        System.out.println();
    }

    public static int randomNumberWithMinMax(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
