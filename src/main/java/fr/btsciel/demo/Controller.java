package fr.btsciel.demo;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Label labelResultat;
    public TextField textFieldEquation;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        miseAJour();
    }

    private void miseAJour() {
        textFieldEquation.textProperty().addListener(event->{
            labelResultat.setText(textFieldEquation.getText().toUpperCase());
        });
    }
}