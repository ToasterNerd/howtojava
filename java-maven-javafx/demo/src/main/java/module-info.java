module com.example {
    requires transitive javafx.graphics; //aca agregue esta linea porque me saltaba el error The type Stage from module javafx.graphics may not be accessible to clients due to missing 'requires transitive'
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;
}

