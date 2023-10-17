public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is it a pangram? " + isPangram);
    }

    public static boolean checkPangram(String sentence) {
        
        sentence = sentence.toLowerCase();

       
        boolean[] letters = new boolean[26];

        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

           
            if ('a' <= ch && ch <= 'z') {
                
                letters[ch - 'a'] = true;
            }
        }

        
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}

