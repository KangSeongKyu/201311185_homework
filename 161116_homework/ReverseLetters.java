class ReverseLetters {
  static void reverse(String l) {
    char[] words = l.toCharArray();
    
    StringBuilder rev = new StringBuilder();
    
    for(int i=words.length-1; i>=0; i--) {
      rev.append(words[i]);
    }
    
    System.out.println("words: " + l);
    System.out.println("Reverse Words: " + rev);
  }
  
  public static void main(String[] args) {
    String l = "sangmyung";
    reverse(l);
  }
}