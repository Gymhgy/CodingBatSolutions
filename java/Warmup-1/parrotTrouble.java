package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class ParrotTrouble {

  /**
   * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
   * Problem Source: https://codingbat.com/prob/p140449
   */
  public boolean parrotTrouble(boolean talking, int hour) {
    return talking&amp;&amp;(hour&lt;7||hour&gt;20);
  }
  

}