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
    ListView<Resource> listViewResources;
    @FXML
    ComboBox searchType;
    @FXML
    TextField searchText;
    @FXML
    Label label;

    private Customer signedIn;
    private Library library;

    public void borrow()
    {
        Resource selected = listViewResources.getSelectionModel().getSelectedItems().get(0);
        selected.bowrrow(signedIn);
        /*label.setText("Select Copy");
        listViewResources.setItems(FXCollections.observableArrayList());
        switch (selected.getClass().getName())
        {
            case "sample.Book":
                for (Book book : library.getBooks())
                {
                    if (book.getAllExceptID().equals(((Book)selected).getAllExceptID()))
                    {
                        listViewResources.getItems().add(book);
                    }
                }
                break;
            case "sample.DVD":
                for (DVD dvd : library.getDVDs())
                {
                    if (dvd.getAllExceptID().equals(((DVD)selected).getAllExceptID()))
                    {
                        listViewResources.getItems().add(dvd);
                    }
                }
                break;
            case "sample.Laptop":
                for (Laptop laptop : library.getLaptops())
                {
                    if (laptop.getAllExceptID().equals(((Laptop)selected).getAllExceptID()))
                    {
                        listViewResources.getItems().add(laptop);
                    }
                }
                break;
        }*/
    }

    public void checkQueue(ActionEvent actionEvent)
    {
        Resource selected = listViewResources.getSelectionModel().getSelectedItems().get(0);
        System.out.println(selected.getRequestQueue());
    }

    public void search(ActionEvent actionEvent)
    {
        listViewResources.setItems(FXCollections.observableArrayList());
        switch (searchType.getSelectionModel().getSelectedItem().toString())
        {
            case "ID":
                for (Resource resource : (library.searchID(Integer.valueOf(searchText.getText()))))
                {
                    listViewResources.getItems().add(resource);
                }
                break;
            case "Title":
                for (Resource resource : (library.searchTitle(searchText.getText())))
                {
                    listViewResources.getItems().add(resource);
                }
                break;
            case "Author":
                for (Resource resource : (library.searchAuthor(searchText.getText())))
                {
                    listViewResources.getItems().add(resource);
                }
                break;
            case "OS":
                for (Resource resource : (library.searchOS(searchText.getText())))
                {
                    listViewResources.getItems().add(resource);
                }
                break;
            case "Any":
                for (Resource resource : (library.search((searchText.getText()))))
                {
                    listViewResources.getItems().add(resource);
                }
                break;
        }
    }
    public void initialize()
    {
        listViewResources.setItems(FXCollections.observableArrayList());

        library = new Library();

        Book book1 = new Book("lol", 1995, "jim", "bob", 14);

        DVD dvd1 = new DVD("foo", 1991, "baa", 8100, 14);

        Laptop laptop1 = new Laptop("30791b", 2015, "Dell", "Inspiron 15 5570", "Windows", 14);

        Book book2 = new Book("lol2",1961, "dave","bob", 14);

        library.addBook(book1);
        library.addDVD(dvd1);
        library.addLaptop(laptop1);
        library.addBook(book2);

        for (Book book : library.getBooks())
        {
            listViewResources.getItems().add(book);
        }
        for (DVD dvd : library.getDVDs())
        {
            listViewResources.getItems().add(dvd);
        }
        for (Laptop laptop : library.getLaptops())
        {
            listViewResources.getItems().add(laptop);
        }

        signedIn = new Customer("aliator", "Alistair", "Bates", 07743334555, new Address("12 Cambrian Place","Swansea","SA11RG"));

        ArrayList<String> searchTypeArray = new ArrayList<>(Arrays.asList("ID", "Title", "Author", "OS", "Any"));
        for (String item : searchTypeArray)
        {
            searchType.getItems().add(item);
        }
        label.setText("Select Resource");
    }

    public void borrowed(ActionEvent actionEvent)
    {
    }

    public void reserved(ActionEvent actionEvent)
    {
    }

    public void requested(ActionEvent actionEvent)
    {
    }

    public void history(ActionEvent actionEvent)
    {
    }
}
