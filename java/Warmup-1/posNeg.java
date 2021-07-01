package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class PosNeg {

  /**
   * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
   * Problem Source: https://codingbat.com/prob/p159227
   */
  public boolean posNeg(int a, int b, boolean negative) {
    return negative ? (a&lt;0&amp;&amp;b&lt;0) : a*b&lt;0;
  }
  

}