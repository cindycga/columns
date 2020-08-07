package com.example.columns;

public class CalculateRows {

  public static int getRows(int lineCount, int columns)
      throws Exception {

    int rows = lineCount / columns;
    int extraRow = lineCount % columns == 0 ? 0 : 1;

    return rows + extraRow;

  }

}
