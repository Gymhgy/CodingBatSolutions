package Map_2;

import java.util.*;
import java.util.stream.*;

public class WordLen {

  /**
   * Given an array of strings, return a Map&lt;String, Integer&gt; containing a key for every different string in the array, and the value is that string's length.
   * Problem Source: https://codingbat.com/prob/p125327
   */
  public Map&lt;String, Integer&gt; wordLen(String[] strings) {
    return Arrays.stream(strings).distinct().collect(Collectors.toMap(x-&gt;x,x-&gt;x.length()));
  
  }
  

}