package Functional_2;

import java.util.*;
import java.util.stream.*;

public class NoZ {

  /**
   * Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
   * Problem Source: https://codingbat.com/prob/p105671
   */
  public List&lt;String&gt; noZ(List&lt;String&gt; strings) {
      return strings.stream().filter(n-&gt;!n.contains("z")).collect(Collectors.toList());
  }
  

}