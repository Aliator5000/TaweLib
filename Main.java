package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static Library library;
    public static Parent root;
    public static User signedIn;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("customerPage.fxml"));
        primaryStage.setTitle("Tawe Lib");
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        library = new Library();

        Book book = new Book("lol", 1995, "jim", "bob", 14);

        DVD dvd = new DVD("foo", 2011, "baa", 8100, 14);

        Laptop laptop = new Laptop("30791b", 2015, "Dell", "Inspiron 15 5570", "Windows", 14);

        Book book2 = new Book("lol2",1961, "dave","bob", 14);

        library.addBook(book);
        library.addDVD(dvd);
        library.addLaptop(laptop);
        library.addBook(book2);

        Customer customer = new Customer("Aliator", "Alistair", "Bates",07743334555,
                new Address("12 Cambrian Place", "Swansea", "SA11RG"));
        library.addCustomer(customer);
        signedIn = customer;

        launch(args);
    }
}
