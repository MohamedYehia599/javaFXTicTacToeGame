package controllers;

import com.client.client.HelloApplication;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class drawOnlineController implements Initializable {
    public JFXButton btnHome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnHome.setOnAction(actionEvent -> btnHomeOnClick(actionEvent));
    }
    public void btnHomeOnClick(ActionEvent e)
    {
        HelloApplication obj = new HelloApplication();
        try {
            obj.switchToOnlinePVP();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
