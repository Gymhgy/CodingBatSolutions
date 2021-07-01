package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class SumDouble {

  /**
   * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
   * Problem Source: https://codingbat.com/prob/p154485
   */
  public int sumDouble(int a, int b) {
    return (a+b)*(a==b?2:1);
  }
  

}