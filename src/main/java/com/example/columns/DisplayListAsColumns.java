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

    // TODO should rename variable column to linesIndex
    // TODO rename i in for loop to currentColumn
    // TODO rename index to row


    // Outside loop forEach iterates through each row
    // Inside loop prints each column in the row by getting the correct item from the list of strings
    //

    IntStream.range(0, rows)
        .forEach(row -> {
          for (int currentColumn = 0; currentColumn < columns; currentColumn++) {
            int linesIndex = row + ((rows) * currentColumn);
            if (linesIndex < lineCount) {
              System.out.printf("%-30s", lines.get(linesIndex));
            }
          }
          System.out.println();
        });
  }
}

