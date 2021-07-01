package String_3;

import java.util.*;
import java.util.stream.*;

public class CountYZ {

  /**
   * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
   * Problem Source: https://codingbat.com/prob/p199171
   */
  public int countYZ(String str) {
    int i = 0;
    for(String x : str.split("[^a-zA-Z]")) {
      if(x.endsWith("y") || x.endsWith("z") || x.endsWith("Y") || x.endsWith("Z")) i++;
    }
    return i;
  }
  

}