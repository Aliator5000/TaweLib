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

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        root = FXMLLoader.load(getClass().getResource("customerPage.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        /*Library library = new Library();

        Book book = new Book("lol", 1995, "jim", "bob", 14);
        System.out.println(book);

        DVD dvd = new DVD("foo", 2011, "baa", 8100, 14);
        System.out.println(dvd);

        Laptop laptop = new Laptop("30791b", 2015, "Dell", "Inspiron 15 5570", "Windows", 14);
        System.out.println(laptop);

        Book book2 = new Book("lol2",1961, "dave","bob", 14);
        System.out.println(book2);

        library.addBook(book);
        library.addDVD(dvd);
        library.addLaptop(laptop);
        library.addBook(book2);

        System.out.println(library.getBooks());
        System.out.println(library.getDVDs());
        System.out.println(library.getLaptops());

        System.out.println(library);

        System.out.println(library.search("bob"));
        System.out.println(library.searchID(4));
        System.out.println(library.searchTitle("fo"));
        System.out.println(library.searchAuthor("jim"));
        System.out.println(library.searchOS("Windows"));*/

        launch(args);
    }
}
