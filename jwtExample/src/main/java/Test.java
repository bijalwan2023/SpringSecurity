public class Test {

	public static int firstNonRepeatingCharIndex(String s) {
	    int[] charCount = new int[26]; // Assuming only lowercase English alphabets

	    // Count occurrences of each character
	    char[] charArray = s.toCharArray();
	    for (int i = 0; i < charArray.length; i++) {
	        charCount[charArray[i] - 'a']++;
	    }

	    // Find the first non-repeating character
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (charCount[c - 'a'] == 1) {
	            return i;
	        }
	    }

	    // If no non-repeating character found, return -1
	    return -1;
	}


    public static void main(String[] args) {
        String s = "abcdcef";
        int index = firstNonRepeatingCharIndex(s);
        if (index != -1) {
            System.out.println("The index of the first non-repeating character is: " + index);
            System.out.println("The character is: " + s.charAt(index));
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}
