import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

    
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String test1 = "listen";
        String test2 = "silent";
        String test3 = "hello";
        String test4 = "world";

        
        System.out.println("Are \"" + test1 + "\" and \"" + test2 + "\" anagrams? "
                + areAnagrams(test1, test2));
        System.out.println("Are \"" + test3 + "\" and \"" + test4 + "\" anagrams? "
                + areAnagrams(test3, test4));
    }
}