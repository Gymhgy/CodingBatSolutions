package Warmup_1;

import java.util.*;
import java.util.stream.*;

public class FrontBack {

  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   * Problem Source: https://codingbat.com/prob/p123384
   */
  public String frontBack(String str) {
    return str.length()&lt;2?str:str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
  }
  

}