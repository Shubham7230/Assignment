import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = splitString(sentence);
        String[][] wordData = createWordData(words);
        
        System.out.println("\nWord Analysis:");
        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        
        for (String[] data : wordData) {
            int length = Integer.parseInt(data[1]);
            System.out.println(data[0] + "\t\t" + length);
        }
        
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
    
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static String[][] createWordData(String[] words) {
        String[][] wordData = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(findStringLength(words[i]));
        }
        
        return wordData;
    }
}