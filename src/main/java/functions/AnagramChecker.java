package functions;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = new String("book");
        String s2 = new String("note");

        if(isAnagram(s1, s2)){
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        }
        else{
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
        }
    }

    static boolean isAnagram(String s1, String s2){
        if(s1.length() == s2.length()){
            for(int i = 0; i < s1.length(); i++){
                if(s2.indexOf(s1.charAt(i)) == -1){
                    return false;
                }
            }
        }
        else{
            return false;
        }

        return true;
    }
}
