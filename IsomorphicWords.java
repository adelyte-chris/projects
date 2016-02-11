import java.util.HashMap;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int count = 0; 
        
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++) {
                HashMap<Character, Character> mapa = new HashMap<Character, Character>();
                HashMap<Character, Character> mapb = new HashMap<Character, Character>();
                boolean x = true;
            
                for (int k = 0; k < words[i].length(); k++) {
                    char a = words[i].charAt(k);
                    char b = words[j].charAt(k);
                  
                    if (!mapa.containsKey(a)) {
                        mapa.put(a, b);
                    }
                    else {
                        if (mapa.get(a) != b) {
                            x = false;
                            break;
                        }
                    }
                }
              
                if (x) {
                    System.out.println("(" + count + ") " + words[i] + " is isomorphic to " + words[j]);
                    count++;
                }
            }
        }
        
        return count;   
    }
      
    public static void main(String [] args){
        IsomorphicWords tester = new IsomorphicWords();
        String [] names = {"aa", "ab", "bb", "cc", "cd"};
        int pairs = tester.countPairs(names);
        System.out.print("" + pairs + " isomorphic pairs total");
    }
      
}
