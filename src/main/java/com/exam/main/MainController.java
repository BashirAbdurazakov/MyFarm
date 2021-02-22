package com.exam.main;

import com.exam.main.items.base.Rock;
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

    boolean isAlive = false;


    @FXML
    void initialize() {

        viewMessages = new StringBuilder();
        System.out.println("Hello world!");
        resourceExtractionButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Task task = new Task<Void>() {
                    @Override public Void call() throws InterruptedException {

                        final int max = 10;
                        for (int i=1; i<=max; i++) {
                            if (isCancelled()) {
                                break;
                            }
//                            viewMessages.append(i).append("\n");
//                            updateMessage(viewMessages.toString());
                            dialogViewLabel.appendText(i + "\n");
                            Thread.sleep(300);
                        }
                        return null;
                    }
                };

//                dialogViewLabel.textProperty().bind(task.messageProperty());
                new Thread(task).start();
            }
        });



    }
}
