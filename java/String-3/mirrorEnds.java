package String_3;

import java.util.*;
import java.util.stream.*;

public class MirrorEnds {

  /**
   * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
   * Problem Source: https://codingbat.com/prob/p139411
   */
  public String mirrorEnds(String string) {
    String b = string;
    String e = new StringBuilder(string).reverse().toString();
    while(!b.equals(e)) {
      b=b.substring(0,b.length()-1);
      e=e.substring(0,e.length()-1);
    }
    return b;
  }
  

}