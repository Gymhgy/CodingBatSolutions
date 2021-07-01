package String_3;

import java.util.*;
import java.util.stream.*;

public class SumNumbers {

  /**
   * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
   * Problem Source: https://codingbat.com/prob/p121193
   */
  public int sumNumbers(String str) {
    java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\d+").matcher(str);
    int n = 0;
    while(m.find()) n += Integer.parseInt(m.group());
    return n;
  }
  

}