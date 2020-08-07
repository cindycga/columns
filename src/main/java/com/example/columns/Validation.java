package com.example.columns;

public class Validation {

  public static void validate(int lineCount, int maxLines, int columns)
      throws Exception {

    if (lineCount > maxLines) {
      throw new Exception("File can only have " + maxLines + "lines");
    }

    if (columns > lineCount) {
      throw new Exception("The file must have more than" + columns + " lines");
    }
  }
}

