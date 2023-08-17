public class Palindrome {
    public static boolean isPalindrome(String strToCheck) {
        strToCheck = strToCheck.toLowerCase();
        int startWord = 0;
        int endWord = strToCheck.length() - 1;

        while (startWord < endWord) {
            if (strToCheck.charAt(startWord) != strToCheck.charAt(endWord)) {
                return false;
            }
            startWord++;
            endWord--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "No devil lived on";
        String str2 = "test string";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }
}