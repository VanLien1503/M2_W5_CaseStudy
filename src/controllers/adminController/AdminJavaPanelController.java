package controllers.adminController;

import controllers.userController.JavaPanelController;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import tools.SwitchPanel;

public class AdminJavaPanelController extends JavaPanelController {
    @FXML
    void goBack(MouseEvent event) {
        SwitchPanel.switchPanel(event, "/fxml/adminFxml/AdminHome.fxml");
    }
}
