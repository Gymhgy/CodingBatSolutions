package Map_2;

import java.util.*;
import java.util.stream.*;

public class FirstChar {

  /**
   * Given an array of non-empty strings, return a Map&lt;String, String&gt; with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
   * Problem Source: https://codingbat.com/prob/p168493
   */
  public Map&lt;String, String&gt; firstChar(String[] strings) {
    return Arrays.stream(strings).collect(Collectors.toMap(x-&gt;x.charAt(0)+"",x-&gt;x,(x,y)-&gt;x+y));
  }
  

}