package com.exam.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

public class MainController {

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
    private DialogPane dialogPanePage;

    @FXML
    private Label choseActionText;

    @FXML
    private Label nameGameView;

    @FXML
    void initialize() {
        resourceExtractionButton.setOnAction(event -> System.out.println("Добывать ресурсы"));
    }
}
