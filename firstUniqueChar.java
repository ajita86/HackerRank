public classs Solution {
  
  public static void main (String[] args) {
    String a = "abcdeabc";
    System.out.println(firstUniqueChar(a));
  }
  
  public static int firstUniqueChar (String s) {
    
    HashMap<Character, Integer> map = new HashMap<>();
    int n = s.length();
    
    for (char ch: s) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    
    for (int i = 0; i < map.size(); i++) {
      if (map.get(s.charAt(i)) == 1)
        return i;
    }
    
    return -1;
    
  }
  
}
