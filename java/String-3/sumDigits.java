package String_3;

import java.util.*;
import java.util.stream.*;

public class SumDigits {

  /**
   * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
   * Problem Source: https://codingbat.com/prob/p197890
   */
  public int sumDigits(String str) {
    return str.chars().filter(Character::isDigit).map(x-&gt;x-48).sum();
  }
  

}