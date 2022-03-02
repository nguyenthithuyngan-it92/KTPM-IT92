module com.nttn.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nttn.bmiapp to javafx.fxml;
    exports com.nttn.bmiapp;
}
