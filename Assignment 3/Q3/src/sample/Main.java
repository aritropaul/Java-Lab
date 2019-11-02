package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.control.Button;

//import java.awt.*;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Assignment Application");

        Button button = new Button();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World");
            }
        };

        button.setText("Say Hello World");
        button.setOnAction(event);

        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
