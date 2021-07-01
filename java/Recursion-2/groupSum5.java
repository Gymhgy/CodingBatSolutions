package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class GroupSum5 {

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
   * Problem Source: https://codingbat.com/prob/p138907
   */
  public boolean groupSum5(int start, int[] nums, int target) {
    return groupSum5(start, nums, target, 0, false);
  }
  private boolean groupSum5(int start, int[] nums, int target, int sum, boolean a) {
    int c;
    return start&gt;=nums.length?sum==target:
    ((c=nums[start++])%5&gt;0&amp;&amp;groupSum5(start,nums,target,sum,0&gt;1))
    ||((!a|c!=1)&amp;&amp;groupSum5(start,nums,target,sum+c,c%5&lt;1));
  }
  

}