package Map_2;

import java.util.*;
import java.util.stream.*;

public class WordCount {

  /**
   * The classic word-count algorithm: given an array of strings, return a Map&lt;String, Integer&gt; with a key for each different string, with the value the number of times that string appears in the array.
   * Problem Source: https://codingbat.com/prob/p117630
   */
  public Map&lt;String, Integer&gt; wordCount(String[] strings) {
    return Arrays.stream(strings).collect(Collectors.toMap(x-&gt;x,x-&gt;1,(x,y)-&gt;x+1));
  
  }
  

}