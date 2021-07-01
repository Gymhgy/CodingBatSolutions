package String_3;

import java.util.*;
import java.util.stream.*;

public class GHappy {

  /**
   * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
   * Problem Source: https://codingbat.com/prob/p198664
   */
  public boolean gHappy(String str) {
    return !str.replaceAll("gg+","").contains("g");
  }
  

}