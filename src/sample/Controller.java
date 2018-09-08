package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private void button1Pressed(ActionEvent event) throws IOException {
        // System.out.println("in button1pressed");

        Stage stage = Main.getPrimaryStage();

        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));

        stage.setScene(new Scene(root, 300, 275));
        stage.show();

    }

}
