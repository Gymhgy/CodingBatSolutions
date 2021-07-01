package Recursion_2;

import java.util.*;
import java.util.stream.*;

public class GroupSum6 {

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)
   * Problem Source: https://codingbat.com/prob/p199368
   */
  public boolean groupSum6(int start, int[] nums, int target) {
    return start&gt;=nums.length?target==0:groupSum6(start+1,nums,target-nums[start])||nums[start]!=6&amp;&amp;groupSum6(start+1,nums,target);
  }
  

}