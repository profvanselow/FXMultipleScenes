package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {


    @FXML
    private void button2Pressed(ActionEvent event) throws IOException {
        //System.out.println("in button2pressed");

        Stage stage = Main.getPrimaryStage();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
}
