package String_3;

import java.util.*;
import java.util.stream.*;

public class CountTriple {

  /**
   * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
   * Problem Source: https://codingbat.com/prob/p195714
   */
  public int countTriple(String str) {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(.)\\1\\1");
    java.util.regex.Matcher matcher = pattern.matcher(str);
    int count = 0, i = 0;
    while(matcher.find(i)) {
      count++;
      i = matcher.start() + 1;
    }
    return count;
  }
  

}