package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class MissingChar {

  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
   * Problem Source: https://codingbat.com/prob/p190570
   */
  public String missingChar(String str, int n) {
      return str.substring(0, n) + str.substring(n + 1);
  }
  

}