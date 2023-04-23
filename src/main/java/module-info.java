module com.mutsa.backend {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.mutsa.backend to javafx.fxml;
    exports com.mutsa.backend;
}