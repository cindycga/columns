package com.example.columns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColumnsApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ColumnsApplication.class, args);
    int maxLines = 1000;

//  Update YourTestData.txt file to have your test data
//  Enter # of columns you want
//  Run main method in IDE

    String fileName = "src/main/java/com/example/columns/YourTestData.txt";
    int yourColumns = 2;
    System.out.println("Your Test Data with "+ yourColumns + " columns");
    DisplayListAsColumns.displayColumns(fileName, yourColumns, maxLines);

    // First Test Input From Requirements:
    String fileName1 = "src/main/java/com/example/columns/TestData1.txt";
    int columns = 2;
    System.out.println("Output for Input 1 with "+ columns + " columns");
    DisplayListAsColumns.displayColumns(fileName1, columns, maxLines);


    // Second Test Input From Requirements:
    String fileName2 = "src/main/java/com/example/columns/TestData2.txt";
    columns = 3;
    System.out.println("Output for Input 2 with "+ columns + " columns");
    DisplayListAsColumns.displayColumns(fileName2, columns, maxLines);

  }
}


