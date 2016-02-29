package com.wallapop.library.test;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TextLibraryTestTest {

  @Test
  public void testGetString(){
    String s = TextLibraryTest.get(1);
    assertEquals("Undefined", s);
  }

}