package com.example.columns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidationTest {

  Validation validation = new Validation();


  @Test
  void testExpectedLineCountException() {
    Assertions.assertThrows(Exception.class, () -> Validation.validate(1001,1000, 5));
  }

  @Test
  void testExpectedColumnException() {
    Assertions.assertThrows(Exception.class, () -> Validation.validate(30,1000, 35));
  }

}