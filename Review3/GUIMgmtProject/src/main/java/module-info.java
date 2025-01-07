module com.assignment.gui.guimgmtproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.gui.guimgmtproject to javafx.fxml;
    exports com.assignment.gui.guimgmtproject;
}