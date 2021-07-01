package Map_2;

import java.util.*;
import java.util.stream.*;

public class AllSwap {

  /**
   * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
   * Problem Source: https://codingbat.com/prob/p134133
   */
  public String[] allSwap(String[] strings) {
    Map&lt;Character,Integer&gt;m=new HashMap&lt;&gt;();
    for(int i = 0; i &lt; strings.length; i++) {
      char k = strings[i].charAt(0);
      if(m.containsKey(k)) {
        String tmp = strings[m.get(k)];
        strings[m.get(k)] = strings[i];
        strings[i] = tmp;
        m.remove(k);
      }
      else m.put(k,i);
    }
    return strings;
  }
  

}