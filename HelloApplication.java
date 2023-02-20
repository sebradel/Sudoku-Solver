package com.example.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Sudoku Solver");
        Button button = new Button();
        button.setText("Solve");
        ArrayList<TextField> textFields = new ArrayList<>();
        GridPane gridPane = createGridPane(textFields);
        gridPane.add(button, 4, 10);

        //When user presses the "solve" button, get the values of each text field
        //and put them in a 2D array, then use the solve function from SudokuSolver
        //to obtain a completed 2D array, and update the text fields
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int[][] grid = new int[9][9];
                int count = 0;
                for(int i=0; i<9; i++){
                    for(int j=0; j<9; j++){
                        String text = textFields.get(count).getText();
                        grid[i][j] = Integer.valueOf(text);
                        count++;
                    }
                }
                count = 0;
                if(SudokuSolver.solve(grid)){
                    for(int i=0; i<9; i++){
                        for(int j=0; j<9; j++){
                            textFields.get(count).setText(String.valueOf(grid[i][j]));
                            count++;
                        }
                    }
                }else{
                    System.out.println("Unable to solve puzzle.");
                }
            }
        });

        Scene scene = new Scene(gridPane, 405, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public GridPane createGridPane(ArrayList<TextField> text){
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);

        //Row 1
        TextField text11 = new TextField("0");
        TextField text12 = new TextField("0");
        TextField text13 = new TextField("0");
        TextField text14 = new TextField("0");
        TextField text15 = new TextField("0");
        TextField text16 = new TextField("0");
        TextField text17 = new TextField("0");
        TextField text18 = new TextField("0");
        TextField text19 = new TextField("0");

        //Row 2
        TextField text21 = new TextField("0");
        TextField text22 = new TextField("0");
        TextField text23 = new TextField("0");
        TextField text24 = new TextField("0");
        TextField text25 = new TextField("0");
        TextField text26 = new TextField("0");
        TextField text27 = new TextField("0");
        TextField text28 = new TextField("0");
        TextField text29 = new TextField("0");

        //Row 3
        TextField text31 = new TextField("0");
        TextField text32 = new TextField("0");
        TextField text33 = new TextField("0");
        TextField text34 = new TextField("0");
        TextField text35 = new TextField("0");
        TextField text36 = new TextField("0");
        TextField text37 = new TextField("0");
        TextField text38 = new TextField("0");
        TextField text39 = new TextField("0");

        //Row 4
        TextField text41 = new TextField("0");
        TextField text42 = new TextField("0");
        TextField text43 = new TextField("0");
        TextField text44 = new TextField("0");
        TextField text45 = new TextField("0");
        TextField text46 = new TextField("0");
        TextField text47 = new TextField("0");
        TextField text48 = new TextField("0");
        TextField text49 = new TextField("0");

        //Row 5
        TextField text51 = new TextField("0");
        TextField text52 = new TextField("0");
        TextField text53 = new TextField("0");
        TextField text54 = new TextField("0");
        TextField text55 = new TextField("0");
        TextField text56 = new TextField("0");
        TextField text57 = new TextField("0");
        TextField text58 = new TextField("0");
        TextField text59 = new TextField("0");

        //Row 6
        TextField text61 = new TextField("0");
        TextField text62 = new TextField("0");
        TextField text63 = new TextField("0");
        TextField text64 = new TextField("0");
        TextField text65 = new TextField("0");
        TextField text66 = new TextField("0");
        TextField text67 = new TextField("0");
        TextField text68 = new TextField("0");
        TextField text69 = new TextField("0");

        //Row 7
        TextField text71 = new TextField("0");
        TextField text72 = new TextField("0");
        TextField text73 = new TextField("0");
        TextField text74 = new TextField("0");
        TextField text75 = new TextField("0");
        TextField text76 = new TextField("0");
        TextField text77 = new TextField("0");
        TextField text78 = new TextField("0");
        TextField text79 = new TextField("0");

        //Row 8
        TextField text81 = new TextField("0");
        TextField text82 = new TextField("0");
        TextField text83 = new TextField("0");
        TextField text84 = new TextField("0");
        TextField text85 = new TextField("0");
        TextField text86 = new TextField("0");
        TextField text87 = new TextField("0");
        TextField text88 = new TextField("0");
        TextField text89 = new TextField("0");

        //Row 9
        TextField text91 = new TextField("0");
        TextField text92 = new TextField("0");
        TextField text93 = new TextField("0");
        TextField text94 = new TextField("0");
        TextField text95 = new TextField("0");
        TextField text96 = new TextField("0");
        TextField text97 = new TextField("0");
        TextField text98 = new TextField("0");
        TextField text99 = new TextField("0");


        gridPane.add(text11, 0,0);
        gridPane.add(text12, 1,0);
        gridPane.add(text13, 2,0);
        gridPane.add(text14, 3,0);
        gridPane.add(text15, 4,0);
        gridPane.add(text16, 5,0);
        gridPane.add(text17, 6,0);
        gridPane.add(text18, 7,0);
        gridPane.add(text19, 8,0);

        gridPane.add(text21, 0,1);
        gridPane.add(text22, 1,1);
        gridPane.add(text23, 2,1);
        gridPane.add(text24, 3,1);
        gridPane.add(text25, 4,1);
        gridPane.add(text26, 5,1);
        gridPane.add(text27, 6,1);
        gridPane.add(text28, 7,1);
        gridPane.add(text29, 8,1);

        gridPane.add(text31, 0,2);
        gridPane.add(text32, 1,2);
        gridPane.add(text33, 2,2);
        gridPane.add(text34, 3,2);
        gridPane.add(text35, 4,2);
        gridPane.add(text36, 5,2);
        gridPane.add(text37, 6,2);
        gridPane.add(text38, 7,2);
        gridPane.add(text39, 8,2);

        gridPane.add(text41, 0,3);
        gridPane.add(text42, 1,3);
        gridPane.add(text43, 2,3);
        gridPane.add(text44, 3,3);
        gridPane.add(text45, 4,3);
        gridPane.add(text46, 5,3);
        gridPane.add(text47, 6,3);
        gridPane.add(text48, 7,3);
        gridPane.add(text49, 8,3);

        gridPane.add(text51, 0,4);
        gridPane.add(text52, 1,4);
        gridPane.add(text53, 2,4);
        gridPane.add(text54, 3,4);
        gridPane.add(text55, 4,4);
        gridPane.add(text56, 5,4);
        gridPane.add(text57, 6,4);
        gridPane.add(text58, 7,4);
        gridPane.add(text59, 8,4);

        gridPane.add(text61, 0,5);
        gridPane.add(text62, 1,5);
        gridPane.add(text63, 2,5);
        gridPane.add(text64, 3,5);
        gridPane.add(text65, 4,5);
        gridPane.add(text66, 5,5);
        gridPane.add(text67, 6,5);
        gridPane.add(text68, 7,5);
        gridPane.add(text69, 8,5);

        gridPane.add(text71, 0,6);
        gridPane.add(text72, 1,6);
        gridPane.add(text73, 2,6);
        gridPane.add(text74, 3,6);
        gridPane.add(text75, 4,6);
        gridPane.add(text76, 5,6);
        gridPane.add(text77, 6,6);
        gridPane.add(text78, 7,6);
        gridPane.add(text79, 8,6);

        gridPane.add(text81, 0,7);
        gridPane.add(text82, 1,7);
        gridPane.add(text83, 2,7);
        gridPane.add(text84, 3,7);
        gridPane.add(text85, 4,7);
        gridPane.add(text86, 5,7);
        gridPane.add(text87, 6,7);
        gridPane.add(text88, 7,7);
        gridPane.add(text89, 8,7);

        gridPane.add(text91, 0,8);
        gridPane.add(text92, 1,8);
        gridPane.add(text93, 2,8);
        gridPane.add(text94, 3,8);
        gridPane.add(text95, 4,8);
        gridPane.add(text96, 5,8);
        gridPane.add(text97, 6,8);
        gridPane.add(text98, 7,8);
        gridPane.add(text99, 8,8);


        text.add(text11);
        text.add(text12);
        text.add(text13);
        text.add(text14);
        text.add(text15);
        text.add(text16);
        text.add(text17);
        text.add(text18);
        text.add(text19);

        text.add(text21);
        text.add(text22);
        text.add(text23);
        text.add(text24);
        text.add(text25);
        text.add(text26);
        text.add(text27);
        text.add(text28);
        text.add(text29);

        text.add(text31);
        text.add(text32);
        text.add(text33);
        text.add(text34);
        text.add(text35);
        text.add(text36);
        text.add(text37);
        text.add(text38);
        text.add(text39);

        text.add(text41);
        text.add(text42);
        text.add(text43);
        text.add(text44);
        text.add(text45);
        text.add(text46);
        text.add(text47);
        text.add(text48);
        text.add(text49);

        text.add(text51);
        text.add(text52);
        text.add(text53);
        text.add(text54);
        text.add(text55);
        text.add(text56);
        text.add(text57);
        text.add(text58);
        text.add(text59);

        text.add(text61);
        text.add(text62);
        text.add(text63);
        text.add(text64);
        text.add(text65);
        text.add(text66);
        text.add(text67);
        text.add(text68);
        text.add(text69);

        text.add(text71);
        text.add(text72);
        text.add(text73);
        text.add(text74);
        text.add(text75);
        text.add(text76);
        text.add(text77);
        text.add(text78);
        text.add(text79);

        text.add(text81);
        text.add(text82);
        text.add(text83);
        text.add(text84);
        text.add(text85);
        text.add(text86);
        text.add(text87);
        text.add(text88);
        text.add(text89);

        text.add(text91);
        text.add(text92);
        text.add(text93);
        text.add(text94);
        text.add(text95);
        text.add(text96);
        text.add(text97);
        text.add(text98);
        text.add(text99);

        return gridPane;
    }
}