package Functional_2;

import java.util.*;
import java.util.stream.*;

public class No9 {

  /**
   * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note:  % by 10)
   * Problem Source: https://codingbat.com/prob/p124510
   */
  public List&lt;Integer&gt; no9(List&lt;Integer&gt; nums) {
      return nums.stream().filter(n-&gt;n%10!=9).collect(Collectors.toList());
  }
  

}