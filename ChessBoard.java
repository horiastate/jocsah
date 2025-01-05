package com.example.jocsah;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessBoard {
    public GridPane createBoard() {
        GridPane gridPane = new GridPane();

        int size = 8; // Tabla de șah este 8x8
        double tileSize = 75; // Dimensiunea fiecărui pătrat

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Rectangle square = new Rectangle(tileSize, tileSize);
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.BEIGE);
                } else {
                    square.setFill(Color.BROWN);
                }
                gridPane.add(square, col, row);
            }
        }

        return gridPane;
    }
}
