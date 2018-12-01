package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerPageController
{
    @FXML
    Button button;
    @FXML
    ListView<Resource> resourceListView;
    @FXML
    ComboBox searchType;
    @FXML
    TextField searchText;
    @FXML
    Label label;

    private Customer signedIn = (Customer)Main.signedIn;
    private Library library = Main.library;

    public void borrow()
    {
        Resource selected = resourceListView.getSelectionModel().getSelectedItems().get(0);
        selected.bowrrow(signedIn);
    }

    public void checkQueue(ActionEvent actionEvent)
    {
        Resource selected = resourceListView.getSelectionModel().getSelectedItems().get(0);
        System.out.println(selected.getRequestQueue());
    }

    public void search(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        switch (searchType.getSelectionModel().getSelectedItem().toString())
        {
            case "ID":
                for (Resource resource : (library.searchID(Integer.valueOf(searchText.getText()))))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Title":
                for (Resource resource : (library.searchTitle(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Author":
                for (Resource resource : (library.searchAuthor(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "OS":
                for (Resource resource : (library.searchOS(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Any":
                for (Resource resource : (library.search((searchText.getText()))))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
        }
    }
    public void borrowed(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getBorrwed())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void reserved(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getReserved())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void requested(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getRequested())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void history(ActionEvent actionEvent)
    {

    }
    public void profileButtonHandler(ActionEvent actionEvent)
    {
        //profilePage
    }

    public void logoutButtonHandler(ActionEvent actionEvent)
    {
        //loginPage
    }

    public void initialize()
    {
        resourceListView.setItems(FXCollections.observableArrayList());

        ArrayList<String> searchTypeArray = new ArrayList<>(Arrays.asList("ID", "Title", "Author", "OS", "Any"));
        for (String item : searchTypeArray)
        {
            searchType.getItems().add(item);
        }
        label.setText("Select Resource");
    }
}
