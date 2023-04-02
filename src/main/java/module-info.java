module com.example.fazekas_tamas_masodfokuegyenlet {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fazekas_tamas_masodfokuegyenlet to javafx.fxml;
    exports com.example.fazekas_tamas_masodfokuegyenlet;
}