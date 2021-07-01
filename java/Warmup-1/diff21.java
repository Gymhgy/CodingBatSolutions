package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class Diff21 {

  /**
   * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
   * Problem Source: https://codingbat.com/prob/p116624
   */
  public int diff21(int n) {
    return Math.abs(21-n)*(n&gt;21?2:1);
  }
  

}