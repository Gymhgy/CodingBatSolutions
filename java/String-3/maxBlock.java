package String_3;

import java.util.*;
import java.util.stream.*;

public class MaxBlock {

  /**
   * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
   * Problem Source: https://codingbat.com/prob/p179479
   */
  public int maxBlock(String str) {
    int i = 0;
    java.util.regex.Matcher m = java.util.regex.Pattern.compile("(.)\\1*").matcher(str);
    while(m.find()) i = Math.max(i, m.group().length());
    return i;
  }
  

}