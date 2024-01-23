import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store the word count
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            // Open the file
            File file = new File("path_to_your_file.txt"); // Replace with your file path
            Scanner scanner = new Scanner(file);

            // Read the file word by word
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase(); // Read a word and convert it to lower case
                // If the word is already in the map, increment its count, otherwise add it to the map with a count of 1
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Print the word count
        for (String word : wordCount.keySet()) {
            System.out.println("Word: " + word + ", Count: " + wordCount.get(word));
        }
    }
}