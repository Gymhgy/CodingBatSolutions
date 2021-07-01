package Map_2;

import java.util.*;
import java.util.stream.*;

public class Pairs {

  /**
   * Given an array of non-empty strings, create and return a Map&lt;String, String&gt; as follows: for each string add its first character as a key with its last character as the value.
   * Problem Source: https://codingbat.com/prob/p126332
   */
  public Map&lt;String, String&gt; pairs(String[] strings) {
    return Arrays.stream(strings).collect(Collectors.toMap(x-&gt;x.charAt(0)+"",x-&gt;x.charAt(x.length()-1)+"",(x,y)-&gt;y));
  }
  

}