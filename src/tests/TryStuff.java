package tests;

import org.junit.Assert;
import org.junit.Test;

public class TryStuff {
  @Test
  public void twoPlusTwoShouldBeFour() {
    int numberOne = 2;
    int numberTwo = 2;
    int result = numberOne + numberTwo;

    Assert.assertEquals("2 + 2 == 4! (I hope)", 4, result);

    boolean x = false;
    if (x == true) {
      System.out.println("it's true");
    } else {
      System.out.println("it is false");
    }
    String s1 = "Hello";
//    String s2 = "Hello";
    String s2 = "He";
    s2 = s2 + "llo";


    if (s1 == s2) {
      System.out.println("they're the same object!!!");
    } else {
      System.out.println("They are NOT the same object!!!");
    }

    if (s1.equals(s2)) {
      System.out.println("they have the same text!!!");
    } else {
      System.out.println("They do NOT have the same text!!!");
    }

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");

    if (sb1 == sb2) {
      System.out.println("they're the same object!!!");
    } else {
      System.out.println("They are NOT the same object!!!");
    }

    if (sb1.equals(sb2)) {
//    if (sb1.toString().equals(sb2.toString())) {
      System.out.println("they have the same text!!!");
    } else {
      System.out.println("They do NOT appear to have the same text!!!");
    }


  }
}
