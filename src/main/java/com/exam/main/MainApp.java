package com.exam.main;


import com.exam.main.player.Player;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ResourceBundle;
import java.util.Scanner;

public class MainApp extends Application {

    Thread thread;

    public static Scanner scanner = new Scanner(System.in);
    public static boolean isWorking = true;

    public static void main(String[] args) {


//        Player player = new Player();
//        boolean isAlive = true;
//
//        boolean isThreadAlive = true;
//        while (isAlive) {
////            player.findItems();
//            System.out.println("Выберите действие: " +
//                    "\n1 - Добывать предметы" +
//                    "\n2 - Построить " +
//                    "\n3 - Создать "+
//                    "\n4 - Накормить животных "+
//                    "\n5 - Поесть"+
//                    "\n0 - Выйти из игры");
//            //test git push
//            int choice = scanner.nextInt();
//            Thread thread = null;
//            switch (choice) {
//                case 1:
////                    System.out.println("Введите время поиска");
////                    int number = scanner.nextInt();
////                    while (isWorking) {
////                        player.findItems();
////                        System.out.println("Завершить задачу ?(y-yes/n-not)");
////                        String next = scanner.next();
////                        if (next.equals("y")) {
////                            isWorking = false;
////                        } else if (next.equals("n")) {
////                            isWorking = true;
////                        } else {
////                            System.out.println("Введите корректное значение");
////                        }
////                    }
////                    isWorking = true
//                    thread = new Thread(new Runnable() {
//                            @Override
//                            public void run() {
//                                while (isWorking) {
//                                    player.findItems();
//                                }
//                            }
//                        });
//                    thread.start();
//                    while(isWorking) {
//                        System.out.println("Завершить задачу ?(y-yes/n-not)");
//                        String next = scanner.next();
//                        if (next.equals("y")) {
//                            isWorking = false;
//                        } else if (next.equals("n")) {
//                            isWorking = true;
//                        } else {
//                            System.out.println("Введите корректное значение");
//                        }
//                    }
//                    try {
//                        thread.join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Поток жив? " + thread.isAlive());
//                    isWorking = true;
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 0:
//                    isAlive = false;
//                default:
//                    break;
//            }
//        }
//
//        System.out.println("Конец");

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Main.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setTitle("Hello JavaFX");
        stage.setWidth(700);
        stage.setHeight(500);
        stage.show();
    }
}
