package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class Split53 {

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
   * Problem Source: https://codingbat.com/prob/p168295
   */
  public boolean split53(int[] nums, Integer... a) {
    int idx = 0, sum3 = 0, sum5 = 0;
    if(a.length &gt; 0) {
      idx = a[0]; sum3 = a[1]; sum5 = a[2];
    }
    if(idx &gt;= nums.length) return sum3 == sum5;
    int cur = nums[idx];
  
    if(cur % 5 == 0) return split53(nums, idx+1, sum3, sum5+cur);
    else if(cur % 3 == 0) return split53(nums, idx+1, sum3+cur, sum5);
    else {
      return split53(nums, idx+1, sum3 + cur, sum5) || split53(nums, idx+1, sum3, sum5+cur);
    }
  }
  

}