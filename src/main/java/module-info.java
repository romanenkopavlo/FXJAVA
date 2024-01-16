module fr.btsciel.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.btsciel.demo to javafx.fxml;
    exports fr.btsciel.demo;
}