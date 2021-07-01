package Functional_2;

import java.util.*;
import java.util.stream.*;

public class NoLong {

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
   * Problem Source: https://codingbat.com/prob/p194496
   */
  public List&lt;String&gt; noLong(List&lt;String&gt; strings) {
      return strings.stream().filter(n-&gt;n.length()&lt;4).collect(Collectors.toList());
  
  }
  

}