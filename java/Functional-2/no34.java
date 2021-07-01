package Functional_2;

import java.util.*;
import java.util.stream.*;

public class No34 {

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
   * Problem Source: https://codingbat.com/prob/p184496
   */
  public List&lt;String&gt; no34(List&lt;String&gt; strings) {
        return strings.stream().filter(n-&gt;n.length()!=3&amp;&amp;n.length()!=4).collect(Collectors.toList());
  }
  

}