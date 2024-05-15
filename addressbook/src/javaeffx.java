import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class javaeffx extends Application {

    private final int numButtons = 15;
    private final int initRows = 3;

    private TextField nameField;
    private TextField addressField;
    private TextField numField;

    enum Countries {
        UK,
        US,
        DE,
        CN
    }

    private ComboBox<Countries> countryCombo = new ComboBox();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(createMenu());
        root.setCenter(createTabs());


        Scene scene = new Scene(root);
        primaryStage.setTitle("AddressBook");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private TabPane createTabs() {
        TabPane tp = new TabPane();
        Tab t1 = new Tab("Entry");
        Tab t2 = new Tab("List");
        Tab t3 = new Tab("Search");

        BorderPane entryPane = new BorderPane();
        entryPane.setCenter(entryTilePane());
        entryPane.setBottom(entryHBox());

        t1.setContent(entryPane);
        tp.getTabs().add(t1);

        //t2.setContent();
        tp.getTabs().add(t2);

        //t3.setContent();
        tp.getTabs().add(t3);
        return tp;
    }

    private MenuBar createMenu() {
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("file");
        MenuItem menuItem = new MenuItem("Save");
        menu.getItems().add(menuItem);
        menuItem = new MenuItem("Load");
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        return menuBar;
    }

    private HBox entryHBox(){
        HBox stuff = new HBox(4);
        Button clearBtn,editBtn,addBtn,delBtn;
        stuff.getChildren().addAll(
                clearBtn = new Button("Clear"),
                editBtn = new Button("Edit"),
                addBtn = new Button("Add"),
                delBtn = new Button("Delete")
        );
        return stuff;
    }

    private TilePane entryTilePane() {
        TilePane entryPane = new TilePane();
        entryPane.setTileAlignment(Pos.CENTER_LEFT);
        entryPane.getChildren().addAll(
                new Label("Name"),
                this.nameField = new TextField(),
                new Label("Number"),
                this.numField = new TextField(),
                new Label("Address"),
                this.addressField = new TextField(),
                new Label("Country"),
                this.countryCombo = new ComboBox<>());
        countryCombo.getItems().addAll(Countries.values());

        entryPane.setPrefColumns(2);
        return entryPane;
    }

    private Tile


    private void save() {
        //task
    }

    private void Load() {
        //loads
    }
}
