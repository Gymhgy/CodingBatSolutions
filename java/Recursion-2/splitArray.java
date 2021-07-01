package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class SplitArray {

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
   * Problem Source: https://codingbat.com/prob/p185204
   */
  public boolean splitArray(int[] nums, Integer...a) {
    int idx = 0, sum1 = 0, sum2 = 0;
    if(a.length &gt; 0) {
      idx = a[0]; sum1 = a[1]; sum2 = a[2];
    }
    if(idx &gt;= nums.length) return sum1 == sum2;
    return splitArray(nums, idx + 1, sum1+nums[idx], sum2) 
    || splitArray(nums, idx + 1, sum1, sum2+nums[idx]);
  }
  

}