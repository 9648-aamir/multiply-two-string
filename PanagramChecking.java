import java.util.HashMap;
import java.util.Map;

public class PanagramChecking {
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        
    
   
        int n = s.length();
        Map<Character, Boolean> m = new HashMap<>();

        s = s.toLowerCase();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                m.put(c, true);
            }
        }

        return m.size() == 26;
    }
}
