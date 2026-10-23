import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "Test.txt";
        Scanner scanner = new Scanner(new File(fileName));

        int countElements = 0;
        int mxLen = -1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            countElements += line.length();
            if (line.length() > mxLen) {
                mxLen = line.length();
            }
		}
        System.out.println("\n");


		System.out.println("Кол-во символов: " + countElements);
        scanner = new Scanner(new File(fileName));
        System.out.println("Максимальная длина строки: " + mxLen);
        scanner = new Scanner(new File(fileName));
        int countWords = 0;
        while (scanner.hasNext()) {
            countWords++;
            scanner.next();
        }
        System.out.println("Кол-во слов: " + countWords);
        System.out.println("\n");
        
        scanner = new Scanner(new File(fileName));
        String[] arrWords = allWords(fileData(scanner));
        
        int wIndex = 0;
        String[] words = new String[5000]; //храним только в нижнем регистре
        int[] counts = new int[5000];

        for (int i = 0; i < arrWords.length; i++) {
            
            if (wordNotCounted(words,arrWords[i])) {
                words[wIndex] = arrWords[i];
                counts[wIndex++] = findWord(arrWords[i], arrWords);
            }
        }

        for (int i = 0; i < wIndex; i++) {
            System.out.println(words[i] + ": " + counts[i]);
        }
        

    }
    static String fileData(Scanner scanner) {
        String str = "";
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            str+=line + " ";
        }
        return str;
    }
    static String clearWord(String word) {
        String newWord = ""; 
        String[] arr = word.split("[.,/?:!]");
        for (String str : arr) {
            newWord += str;
        }
        return newWord;
    }


    static String[] allWords(String str) {
        String[] words = clearWord(str).split(" ");
        int t = words.length;
        String[] lowWords = new String[t];
        for (int i = 0; i < t; i++) {
            lowWords[i] = words[i].toLowerCase();
        }
        return lowWords;

    }

    static int findWord(String word, String[] arrWords) {
        int count = 0;
        for (int i = 0; i < arrWords.length; i++) {
            if (word.equals(arrWords[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean wordNotCounted(String[] words, String word) {
        for (String s : words) {
            if (s != null && s.equals(word)) {
                return false;
            }
        }
        return true;
    }

   

}
	

/*

\n



String[] words = new String[21000]; //храним только в нижнем регистре
int[] counts = new int[21000];


int count = -1;

String clearWord(String word) // .,:!?
 */
