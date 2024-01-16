package fr.btsciel.demo;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends EqResoudre implements Initializable{
    public Label labelResultat;
    public TextField textFieldEquation;
    public EqResoudre resoudre = new EqResoudre();

    public Controller() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        resoudre();
    }

    private void resoudre() {
        textFieldEquation.textProperty().addListener(event->{
            if (resoudre.typeEquationOk(textFieldEquation.getText())) {
                textFieldEquation.getStyleClass().clear();
                textFieldEquation.getStyleClass().addAll("text-field", "text-input","ok");
                labelResultat.setText(resoudre.resoudre(textFieldEquation.getText()));
            } else {
                textFieldEquation.getStyleClass().clear();
                textFieldEquation.getStyleClass().addAll("text-field", "text-input","noOk");
                labelResultat.setText("Format non autorise");
            }
        });
    }
}