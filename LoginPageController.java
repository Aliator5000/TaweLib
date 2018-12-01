package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController
{
    @FXML
    TextField username;

    @FXML
    Button loginButton;

    @FXML
    public void loginButtonHandler(ActionEvent actionEvent) throws IOException
    {
        //Switch to correct page
        //set signed in
    }
}
