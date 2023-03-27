import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
       launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
                Parent parent = FXMLLoader.load(
                getClass().getResource("views/mainPanel.fxml")   );
            
                
        // StackPane stackPane = new StackPane();
        Scene scene = new Scene(parent,400,300);
        stage.setScene(scene);
        stage.show();
    }
}
