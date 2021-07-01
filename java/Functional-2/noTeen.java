package Functional_2;

import java.util.*;
import java.util.stream.*;

public class NoTeen {

  /**
   * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
   * Problem Source: https://codingbat.com/prob/p137274
   */
  public List&lt;Integer&gt; noTeen(List&lt;Integer&gt; nums) {
      return nums.stream().filter(n-&gt;n&lt;13||n&gt;19).collect(Collectors.toList());
  }
  

}