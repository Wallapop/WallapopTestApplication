package com.wallapop.test.application;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TextBuilderTest {

  @Test
  public void testGetText(){
    int index = 1;
    String t = TextBuilder.getText(index);
    assertEquals("Test 2", t);
  }

}