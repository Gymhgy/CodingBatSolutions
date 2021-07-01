package Functional_2;

import java.util.*;
import java.util.stream.*;

public class Square56 {

  /**
   * Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
   * Problem Source: https://codingbat.com/prob/p132748
   */
  public List&lt;Integer&gt; square56(List&lt;Integer&gt; nums) {
    return nums.stream().map(n-&gt;n*n+10).filter(n-&gt;(n%=10)!=5&amp;&amp;n!=6).collect(Collectors.toList());
  }
  

}