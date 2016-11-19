import java.util.Map;
import java.util.HashMap;

class CountLetters {
  
  static Map<String,Integer> wc = new HashMap<String,Integer>();
  
  static void counting(String l) {
    char[] letters = l.toCharArray();
    
    String s;
    for(char c : letters) {
      s=Character.toString(c);
      if(wc.containsKey(s)) {
        wc.put(s,wc.get(s)+1);
      }else {
        wc.put(s,1);
      }
    }
    System.out.println("words: " + l);
    System.out.println("count each alphabets: " + wc);
  }
  
  public static void main(String[] args) {
    String l = "media software";
    counting(l);
  }
}