import java.util.Scanner;

public class WordAnalyzing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = splitString(sentence);
        String[][] wordData = createWordData(words);
        String[] result = findShortestLongest(wordData);
        
        System.out.println("Shortest word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest word: " + result[2] + " (Length: " + result[3] + ")");
        
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
    
    public static String[] findShortestLongest(String[][] wordData) {
        if (wordData.length == 0) {
            return new String[]{"", "0", "", "0"};
        }
        
        String shortestWord = wordData[0][0];
        String shortestLength = wordData[0][1];
        String longestWord = wordData[0][0];
        String longestLength = wordData[0][1];
        
        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            int shortLength = Integer.parseInt(shortestLength);
            int longLength = Integer.parseInt(longestLength);
            
            if (currentLength < shortLength) {
                shortestWord = wordData[i][0];
                shortestLength = wordData[i][1];
            }
            if (currentLength > longLength) {
                longestWord = wordData[i][0];
                longestLength = wordData[i][1];
            }
        }
        
        return new String[]{shortestWord, shortestLength, longestWord, longestLength};
    }
}