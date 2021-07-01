package Functional_2;

import java.util.*;
import java.util.stream.*;

public class NoYY {

  /**
   * Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
   * Problem Source: https://codingbat.com/prob/p115967
   */
  public List&lt;String&gt; noYY(List&lt;String&gt; strings) {
    return strings.stream().map(n-&gt;n+"y").filter(n-&gt;!n.contains("yy")).collect(Collectors.toList());
  
  }
  

}