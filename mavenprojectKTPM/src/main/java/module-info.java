module com.nttn.mavenprojectktpm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nttn.mavenprojectktpm to javafx.fxml;
    exports com.nttn.mavenprojectktpm;
}
