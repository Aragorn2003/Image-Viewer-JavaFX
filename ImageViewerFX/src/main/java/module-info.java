module com.mycompany.imageviewerfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.imageviewerfx to javafx.fxml;
    exports com.mycompany.imageviewerfx;
}
