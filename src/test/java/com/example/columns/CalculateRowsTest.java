package com.example.columns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateRowsTest {

  CalculateRows calculateRows = new CalculateRows();


  @Test
  void testEvenRows() throws Exception {
    Assertions.assertEquals(20, calculateRows.getRows(100,5));
  }

  @Test
  void testLessThanEvenRows() throws Exception {
    Assertions.assertEquals(20, calculateRows.getRows(99,5));
  }

  @Test
  void testForExtraRows() throws Exception {
    Assertions.assertEquals(21, calculateRows.getRows(101,5));
  }

}