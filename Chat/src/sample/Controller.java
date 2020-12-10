package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {

    @FXML
    private TextField inputText;

    @FXML
    private Button sendButton;

    @FXML
    private TextArea chatLog;

    @FXML
    private ListView chatMembers;

    //Действие поля
//    public String getInput(ActionEvent actionEvent) {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
    //Действие кнопки

    @FXML
    private void sendToTextArea(ActionEvent actionEvent) {
        chatLog.appendText(inputText.getText());
        chatLog.appendText("\n");
        inputText.clear();
    }

    //Действие поля
    @FXML
    private TextField getInputText() {
        return inputText;
    }
}