package String_3;

import java.util.*;
import java.util.stream.*;

public class EqualIsNot {

  /**
   * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
   * Problem Source: https://codingbat.com/prob/p141736
   */
  public boolean equalIsNot(String str) {
    java.util.regex.Pattern is = java.util.regex.Pattern.compile("is"), not = java.util.regex.Pattern.compile("not");
    java.util.regex.Matcher isMatcher = is.matcher(str), notMatcher = not.matcher(str);
    int numIs = 0, numNot = 0;
    while (isMatcher.find())
      numIs++;
    while (notMatcher.find())
      numNot++;
    return numIs == numNot;
  }
  

}