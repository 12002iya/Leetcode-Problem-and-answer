package SAMPLE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumboCompressor {

    public static boolean containsJumboSequence(String word) {
        String sequence = "JUMBO";
        int seqIndex = 0;

        for (char c : word.toCharArray()) {
            if (seqIndex < sequence.length() && c == sequence.charAt(seqIndex)) {
                seqIndex++;
            }
            if (seqIndex == sequence.length()) {
                return true;
            }
        }
        return false;
    }

    public static List<String> compressWords(List<String> words) {
        List<String> compressedWords = new ArrayList<>();
        for (String word : words) {
            if (containsJumboSequence(word.toUpperCase())) {
                compressedWords.add("JUMBO");
            } else {
                compressedWords.add(word);
            }
        }
        return compressedWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        System.out.println("Enter words (type 'exit' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            words.add(input);
        }
        List<String> compressedWords = compressWords(words);
        System.out.println(compressedWords);
        scanner.close();
    }
}
