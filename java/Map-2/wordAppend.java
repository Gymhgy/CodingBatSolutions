package Map_2;

import java.util.*;
import java.util.stream.*;

public class WordAppend {

  /**
   * Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
   * Problem Source: https://codingbat.com/prob/p103593
   */
  public String wordAppend(String[] strings) {
    Map&lt;String,Integer&gt;m = new HashMap&lt;String,Integer&gt;();
    return Arrays.stream(strings).reduce("", (x,y)-&gt;m.merge(y,1,(a,b)-&gt;a+b)%2&lt;1?x+y:x);
  }
  

}