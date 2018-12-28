import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;


/**
 * @author Tucker Nielsen, Westley Grove
 * Last modified 12 / 20 / 2018
 */

public class RPG extends Application {
    private Scanner scan = new Scanner(System.in);
//    private String playerName = scan.next();
//    computerCharacters ai = new computerCharacters();
//    Abilities ab = new Abilities();
//    Items its = new Items();
//    PlayerCharacter ch = new PlayerCharacter(playerName, 100, 100, 100, 100, 100, 100, 100) {
//        @Override
//        public void useItem(int index) {
//
//        }
//
//        @Override
//        public void act() {
//        }
//    };

    private void loadGame(File filename) {
        ArrayList<String> profile = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                profile.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveGame(File filename) throws FileNotFoundException {
        System.out.print("Would you like to save this game?");
        if (scan.hasNext("yes") || scan.hasNext("Yes")) {
            PrintWriter pwt = new PrintWriter(filename);
            pwt.println(filename);
            pwt.close();
        } else {
            System.out.print("Closing dialogue box");

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("This RPG");
        Button newGame = new Button();
        newGame.setText("New Game");
        newGame.setOnAction(event -> {

        });
        Button loadGame = new Button();
        loadGame.setText("Load Game");
        loadGame.setLayoutX(200);
        loadGame.setLayoutY(200);
        loadGame.setOnAction(event -> {

        });
        Group grp = new Group();
        grp.getChildren().add(newGame);
        grp.getChildren().add(loadGame);
        primaryStage.setScene(new Scene(grp, 350, 350));
        primaryStage.show();
    }
}