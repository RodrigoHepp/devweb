module br.com.sysobras {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.sysobras to javafx.fxml;
    exports br.com.sysobras;
}
