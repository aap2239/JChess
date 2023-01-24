package com.chess.engine.board;

public class BoardUtils {

    public static final boolean[] FIRST_COLUMN = {};
    public static final boolean[] SECOND_COLUMN = {};
    public static final boolean[] SEVENTH_COLUMN = {};
    public static final boolean[] EIGHTH_COLUMN = {};

    private BoardUtils() {
        throw new RuntimeException("You cannot instantiate BoardUtils!");
    }
    public static boolean isValidTileCoordinate(int tileCoordinate) {
        return tileCoordinate >= 0 && tileCoordinate < 64;
    }
}
