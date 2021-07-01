package String_3;

import java.util.*;
import java.util.stream.*;

public class SameEnds {

  /**
   * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
   * Problem Source: https://codingbat.com/prob/p131516
   */
  public String sameEnds(String string) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile("(.*).*\\1").matcher(string);
    m.matches();
    return m.group(1);
  }
  

}