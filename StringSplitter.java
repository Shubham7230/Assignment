import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] customSplit = splitString(sentence);
        String[] builtinSplit = sentence.split(" ");
        
        boolean areEqual = compareArrays(customSplit, builtinSplit);
        
        System.out.println("Custom split result:");
        for (String word : customSplit) {
            System.out.println("\"" + word + "\"");
        }
        
        System.out.println("Built-in split result:");
        for (String word : builtinSplit) {
            System.out.println("\"" + word + "\"");
        }
        
        System.out.println("Arrays are equal: " + areEqual);
        
        scanner.close();
    }
    
    public static String[] splitString(String text) {
        if (text.isEmpty()) {
            return new String[0];
        }
        
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int index = 1;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[wordCount] = text.length();
        
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            words[i] = text.substring(start, end);
        }
        
        return words;
    }
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
}