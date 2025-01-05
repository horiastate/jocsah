package com.example.jocsah;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Afișează meniul principal
        showMenu();

        primaryStage.setTitle("Joc de Șah");
        primaryStage.show();
    }

    private void showMenu() {
        // Layout pentru meniul principal
        VBox menuLayout = new VBox(20);
        menuLayout.setStyle("-fx-background-color: lightgray;");
        menuLayout.setPrefSize(400, 300);

        // Butonul "Play Game"
        Button playButton = new Button("Play Game");
        playButton.setPrefSize(100, 40);
        playButton.setOnAction(e -> showChessBoard());

        // Butonul "Quit"
        Button quitButton = new Button("Quit");
        quitButton.setPrefSize(100, 40);
        quitButton.setOnAction(e -> primaryStage.close());

        menuLayout.getChildren().addAll(playButton, quitButton);
        menuLayout.setStyle("-fx-alignment: center;");

        Scene menuScene = new Scene(menuLayout);
        primaryStage.setScene(menuScene);
    }

    private void showChessBoard() {
        // Layout pentru tabla de șah
        StackPane chessLayout = new StackPane();
        chessLayout.setStyle("-fx-background-color: #2e8b57;"); // Verde confortabil

        ChessBoard board = new ChessBoard();
        GridPane chessBoard = board.createBoard();

        // Setăm dimensiunea GridPane (tabla) la jumătate din lățimea/înălțimea ecranului
        chessBoard.setMaxSize(400, 400);
        chessBoard.setPrefSize(400, 400);

        // Adaugăm tabla la centrul layout-ului
        chessLayout.getChildren().add(chessBoard);

        // Creăm scena și o setăm
        Scene chessScene = new Scene(chessLayout, 800, 600);

        // Permitem fullscreen
        primaryStage.setFullScreen(true);
        primaryStage.setScene(chessScene);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
