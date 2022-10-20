module com.example.minimalexample {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.minimalexample to javafx.fxml;
    exports com.example.minimalexample;
}