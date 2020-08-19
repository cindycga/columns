package com.example.columns;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcessFileTest {

  ProcessFile processFile = new ProcessFile();
  String over1000 = "src/main/test/com/example/columns/Over1000Lines.txt";
  String validFile = "src/main/test/com/example/columns/ValidFile.txt";

  @Test
  void testFileOver1000Lines() {
    Assertions.assertThrows(IOException.class, () -> processFile.readFile(over1000));
  }

  @Test
  void testValidFile() throws IOException {
    // Read the text file and return as list
    List<String> lines = ProcessFile.readFile(validFile);
    Assertions.assertEquals(25, lines.size());
  }



}