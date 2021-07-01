package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class GroupSumClump {

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
   * Problem Source: https://codingbat.com/prob/p105136
   */
  public boolean groupSumClump(int start, int[] nums, int target) {
    return groupSumClump(start, nums, target, 0);
  }
  public boolean groupSumClump(int start, int[] nums, int target, int sum) {
    if(start &gt;= nums.length) return sum == target;
    int cur = nums[start];
    int i = 0;
    for(; i &lt; nums.length - start &amp;&amp; nums[start + i] == cur; i++);
    cur *= i;
    return groupSumClump(start + i, nums, target, sum + cur) || 
    groupSumClump(start + i, nums, target, sum);
  }
  

}