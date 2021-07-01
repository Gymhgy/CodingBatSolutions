package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class NearHundred {

  /**
   * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
   * Problem Source: https://codingbat.com/prob/p184004
   */
  public boolean nearHundred(int n) {
    return Math.abs(100-n)&lt;=10||Math.abs(200-n)&lt;=10;
  }
  

}