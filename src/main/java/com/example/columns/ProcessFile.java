package com.example.columns;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class ProcessFile {

  public static List<String> readFile(String fileName)
      throws IOException {

    List<String> lines = Files.lines(Paths.get(fileName))
       // .sorted()
        .collect(Collectors.toList());

    return lines;
  }
}
