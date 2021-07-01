package Map_2;

import java.util.*;
import java.util.stream.*;

public class FirstSwap {

  /**
   * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
   * Problem Source: https://codingbat.com/prob/p150113
   */
  public String[] firstSwap(String[] strings) {
    Map&lt;Character,Integer&gt;m=new HashMap&lt;&gt;();
    for(int i = 0; i &lt; strings.length; i++) {
      char k = strings[i].charAt(0);
      if(m.getOrDefault(k,-1)&gt;=0) {
        String tmp = strings[m.get(k)];
        strings[m.get(k)] = strings[i];
        strings[i] = tmp;
        m.put(k,-1);
      }
      else m.merge(k,i,(q,w)-&gt;-1);
    }
    return strings;
  }
  

}