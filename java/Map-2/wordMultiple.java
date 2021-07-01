package Map_2;

import java.util.*;
import java.util.stream.*;

public class WordMultiple {

  /**
   * Given an array of strings, return a Map&lt;String, Boolean&gt; where each different string is a key and its value is true if that string appears 2 or more times in the array.
   * Problem Source: https://codingbat.com/prob/p190862
   */
  public Map&lt;String, Boolean&gt; wordMultiple(String[] strings) {
    return Arrays.stream(strings).collect(Collectors.toMap(x-&gt;x,x-&gt;1&lt;0,(x,y)-&gt;1&gt;0));
  }
  

}