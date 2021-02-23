package com.exam.main;

import com.exam.main.items.base.Rock;
import com.exam.main.player.Player;
import javafx.application.Platform;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.concurrent.Task;
import javafx.scene.layout.FlowPane;

public class MainController {

    private static final int MAX_SIZE_VIEW_LABEL = 18;


    private StringBuilder viewMessages;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label textViewLabel;

    @FXML
    private Button resourceExtractionButton;

    @FXML
    private Button buildButton;

    @FXML
    private Button createButton;

    @FXML
    private Label choseActionText;

    @FXML
    private Label nameGameView;


    @FXML
    private TextArea dialogViewLabel;

    @FXML
    private Label completeTaskLable;

    @FXML
    private Button completeTaskButton;

    volatile boolean isAlive = true;

    private Task task;

    private static final Player player = new Player("Player");

    @FXML
    void initialize() {

        viewMessages = new StringBuilder();
        System.out.println("Hello world!");
        resourceExtractionButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                task = new Task<Void>() {
                    @Override public Void call() throws InterruptedException {
                        completeTaskLable.setVisible(true);
                        completeTaskButton.setVisible(true);
                        final int max = 10;
                        for (int i=1; i<=max; /*i++*/) {
                            if (isCancelled()) {
                                break;
                            }
                            player.findItems(dialogViewLabel);
                            System.out.println(isAlive);
//                            viewMessages.append(i).append("\n");
//                            updateMessage(viewMessages.toString());
//                            dialogViewLabel.appendText(i + "\n");
//                            Thread.sleep(500);
                        }
                        isAlive = true;
                        return null;
                    }
                };

//                dialogViewLabel.textProperty().bind(task.messageProperty());
                new Thread(task).start();
            }
        });

        completeTaskButton.setOnAction(event -> {
            task.cancel();
            isAlive = false;
            completeTaskLable.setVisible(false);
            completeTaskButton.setVisible(false);
        });
    }
}
