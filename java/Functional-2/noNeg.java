package Functional_2;

import java.util.*;
import java.util.stream.*;

public class NoNeg {

  /**
   * Given a list of integers, return a list of the integers, omitting any that are less than 0.
   * Problem Source: https://codingbat.com/prob/p103456
   */
  public List&lt;Integer&gt; noNeg(List&lt;Integer&gt; nums) {
    return nums.stream().filter(n-&gt;n&gt;=0).collect(Collectors.toList());
  }
  

}