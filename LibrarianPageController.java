package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LibrarianPageController
{
    @FXML
    TextField usernameField;
    @FXML
    Label dateLabel;
    @FXML
    Label numberLabel;

    public void requestButtonHandler(ActionEvent actionEvent)
    {
        //requestResourcePage
    }
    public void fineButtonHandler(ActionEvent actionEvent)
    {
        //finePage
    }
    public void customerButtonHandler(ActionEvent actionEvent)
    {
        //createCustomerPage
    }
    public void profileButtonHandler(ActionEvent actionEvent)
    {
        //profilePage
    }
    public void logoutButtonHandler(ActionEvent actionEvent)
    {
        //loginPage
    }
    public void bookButtonHandler(ActionEvent actionEvent)
    {
        //editButtonPage
    }
    public void dvdButtonHandler(ActionEvent actionEvent)
    {
        //editDVDPage
    }
    public void laptopButtonHandler(ActionEvent actionEvent)
    {
        //editLaptopPage
    }
}
