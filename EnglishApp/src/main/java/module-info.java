module com.nttn.englishapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;
    requires java.sql;

    opens com.nttn.englishapp to javafx.fxml;
    exports com.nttn.englishapp;
    exports com.nttn.pojo;
}
