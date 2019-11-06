package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Collection;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox root = new VBox();

        HBox row1 = new HBox();

        root.setSpacing(20);
        row1.setSpacing(10);
        ComboBox schoolsList = new ComboBox();
        schoolsList.setPromptText("Select School");
        schoolsList.getItems().addAll(
                "School of Computer Sciences and Engineering",
                "School of Information Technology",
                "School of Electronics Engineering",
                "School of Electrical Engineering",
                "School of Bio Sciences and Technology",
                "School of Mechanical and Civil Engineering"
        );

        Label schoolName = new Label();

        schoolsList.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                schoolName.setText((String) t1);
            }
        });

        HBox.setMargin(row1,new Insets(20,20,20,20));
        HBox.setMargin(schoolsList, new Insets(20,20,20,20));
        HBox.setMargin(schoolName, new Insets(25,20,20,0));

        HBox row2 = new HBox();
        row2.setSpacing(10);

        String ETH[] = {"Blockchain", "Cyber Sec"};
        String TH[] = {"Japanese","French"};
        String ETL[] = {"Web Mining", "Java Programming"};
        String ETLP[] = {"Physics", "Chemistry"};
        String LO[] = {"Python", "OOPS"};

        ComboBox courseList = new ComboBox();

        ToggleGroup courseToggle = new ToggleGroup();
        RadioButton courseTypes[] = {new RadioButton("ETH"),new RadioButton("TH"),new RadioButton("ETL"),new RadioButton("ETLP"),new RadioButton("LO")};


        for (RadioButton button : courseTypes){
            HBox.setMargin(button, new Insets(0,10,20,20));
            button.setToggleGroup(courseToggle);
        }

        courseToggle.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                courseList.setPromptText("Select Course");
                RadioButton rb = (RadioButton) courseToggle.getSelectedToggle();
                if (courseToggle.getSelectedToggle() != null) {
                    switch (rb.getText()){
                        case "ETH": courseList.getItems().setAll(ETH); break;
                        case "TH":  courseList.getItems().setAll(TH); break;
                        case "ETL": courseList.getItems().setAll(ETL); break;
                        case "ETLP": courseList.getItems().setAll(ETLP); break;
                        case "LO": courseList.getItems().setAll(LO); break;
                    }
                }
            }
        });


        HBox row3 = new HBox();

        ComboBox languages = new ComboBox();
        languages.getItems().addAll(
                "C",
                "C++",
                "Python",
                "Java"
        );

        Label structLabel = new Label();

        HBox.setMargin(languages, new Insets(20,20,20,20));
        HBox.setMargin(structLabel, new Insets(25,20,20,20));
        languages.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object oldValue, Object newValue) {
                switch (languages.getValue().toString()){
                    case "C" : structLabel.setText("#include<stdio.h>\n\nint main(){\n\tprintf(\"Hello World\");\n\treturn 0;\n}");break;
                    case "C++" : structLabel.setText("#include<iostream>\n\nint main(){\n\tcout<<\"Hello World\";\n\treturn 0;\n}");break;
                    case "Python" : structLabel.setText("print(\"Hello World\")");break;
                    case "Java" : structLabel.setText("public class Test {\n\t public static void main(String args[]) {\n\t\t System.out.println(\"Hello World\");\n\t}\n}");break;
                }
            }
        });

        Color col = Color.rgb(205,205,205);
        Background background = new Background(new BackgroundFill(col, new CornerRadii(12), Insets.EMPTY));
        structLabel.setBackground(background);
        structLabel.setPadding(new Insets(20,20,20,20));

        root.getChildren().addAll(row1, row2, row3);
        row1.getChildren().addAll(schoolsList, schoolName);
        row2.getChildren().addAll(courseTypes);
        row2.getChildren().add(courseList);
        row3.getChildren().addAll(languages, structLabel);

        primaryStage.setTitle("Java Digital Assignment");
        primaryStage.setScene(new Scene(root, 650, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
