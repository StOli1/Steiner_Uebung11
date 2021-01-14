package controllerview;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.CarDatabase;
import model.Vehicle;


import java.io.IOException;
import java.util.LinkedList;

public class Controller {
    @FXML
    private TextArea txtArea;
    @FXML
    private TextField txt;
    private CarDatabase cardb = new CarDatabase();

    //create stage
    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("/controllerview/cardatabase.fxml"));
            Parent root = fxmlLoader.load();

            stage.setTitle("Car Database");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e){
            System.err.println("Something wrong with firstV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    @FXML
    public void searchFor(){
        double start = System.currentTimeMillis();
        LinkedList<Vehicle> result = cardb.search(txt.getText(), false);
        txtArea.setText("");
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != null)
            txtArea.appendText(result.get(i).toString() + "\n");
        }
        double end = System.currentTimeMillis();
        System.out.println("Run Time:" + (end - start) + "milli-sec.");
    }

    @FXML
    public void searchExact(){
        double start = System.currentTimeMillis();
        LinkedList<Vehicle> result = cardb.search(txt.getText(), true);
        txtArea.setText("");
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != null)
            txtArea.setText(result.get(i).toString() + "\n");
        }
            double end = System.currentTimeMillis();
            System.out.println("Run Time:" + (end - start) + "milli-sec.");
        }
}
