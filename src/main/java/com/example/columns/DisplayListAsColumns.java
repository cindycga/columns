package com.example.columns;

import java.util.List;
import java.util.stream.IntStream;

public class DisplayListAsColumns {

  public static void displayColumns(String fileName, int columns, int maxLines) throws Exception {

    // Read the text file and return as list
    List<String> lines = ProcessFile.readFile(fileName);

    // Validate lines, columns
    int lineCount = lines.size();
    Validation.validate(lineCount, maxLines, columns);

    // Calculate # of rows per column using number of lines and number of columns
    int rows = CalculateRows.getRows(lineCount, columns);

    // Iterate through the lines and print each row
    // A row will be formed using the column variable to select the index of the item in the list
    IntStream.range(0, rows)
        .forEach(index -> {
          for (int i = 0; i < columns; i++) {
            int column = index + ((rows) * i);
            if (column < lineCount) {
              System.out.printf("%-30s", lines.get(column));
            }
          }
          System.out.println();
        });
  }
}

