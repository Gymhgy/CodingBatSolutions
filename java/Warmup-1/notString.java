package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class NotString {

  /**
   * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
   * Problem Source: https://codingbat.com/prob/p191914
   */
  public String notString(String str) {
    return str.startsWith("not") ? str : "not " + str;
  }
  

}