package Map_2;

import java.util.*;
import java.util.stream.*;

public class Word0 {

  /**
   * Given an array of strings, return a Map&lt;String, Integer&gt; containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
   * Problem Source: https://codingbat.com/prob/p152303
   */
  public Map&lt;String, Integer&gt; word0(String[] strings) {
    return Arrays.stream(strings).distinct().collect(Collectors.toMap(x-&gt;x,x-&gt;0));
  }
  

}