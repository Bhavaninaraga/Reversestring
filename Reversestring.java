public class Reversestring {
    public static void main(String[] args) {
        // Sample string
        String str = "hello world";
        
        // Function call to reverse the string
        String reversedStr = reverseString(str);
        
        // Display the reversed string
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    // Function to reverse the string
    public static String reverseString(String str) {
        // Convert the string to a StringBuilder object for efficient modification
        StringBuilder sb = new StringBuilder(str);
        
        // Reverse the string using StringBuilder's reverse method
        return sb.reverse().toString();
    }
}
