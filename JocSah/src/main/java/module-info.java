module com.example.jocsah {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.jocsah to javafx.fxml;
    exports com.example.jocsah;
}