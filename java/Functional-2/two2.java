package Functional_2;

import java.util.*;
import java.util.stream.*;

public class Two2 {

  /**
   * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
   * Problem Source: https://codingbat.com/prob/p148198
   */
  public List&lt;Integer&gt; two2(List&lt;Integer&gt; nums) {
    return nums.stream().map(n-&gt;n*2).filter(n-&gt;n%10!=2).collect(Collectors.toList());
  
  }
  

}