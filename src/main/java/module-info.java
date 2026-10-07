module com.example.method_overload_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.method_overload_practice to javafx.fxml;
    exports com.example.method_overload_practice;
}