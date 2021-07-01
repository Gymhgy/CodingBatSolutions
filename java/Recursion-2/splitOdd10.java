package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class SplitOdd10 {

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
   * Problem Source: https://codingbat.com/prob/p171660
   */
  public boolean splitOdd10(int[] nums, Integer...a) {
    int idx = 0, sum10 = 0, sumOdd = 0;
    if(a.length &gt; 0) {
      idx = a[0]; sum10 = a[1]; sumOdd = a[2];
    }
    if(idx &gt;= nums.length) return sum10 % 10 == 0 &amp;&amp; sumOdd % 2 ==1;
    return splitOdd10(nums, idx + 1, sum10+nums[idx], sumOdd) 
    || splitOdd10(nums, idx + 1, sum10, sumOdd+nums[idx]);
  }
  

}