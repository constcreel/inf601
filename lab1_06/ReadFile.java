import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "Test.txt";
        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println("\n");

        scanner = new Scanner(new File(fileName));
        int countElements = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            countElements += line.length();
		}
        System.out.println("\n");


		System.out.println("Кол-во символов: " + countElements);
        scanner = new Scanner(new File(fileName));
        int mxLen = scanner.nextLine().length();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.length() > mxLen) {
            	mxLen = line.length();
            }
		}
        System.out.println("Максимальная длина строки: " + mxLen);
        System.out.println("\n");


        scanner = new Scanner(new File(fileName));
        String[] arrWords = allWords(fileData(scanner));
        System.out.println("Кол-во строк: " + arrWords.length);
        int wIndex = 0;
        String[] words = new String[21000]; //храним только в нижнем регистре
        int[] counts = new int[21000];

        for (int i = 0; i < arrWords.length; i++) {
            int count = 0;
            if (wordNotCounted(words,arrWords[i])) {
                words[wIndex] = arrWords[i];
                for (int j = 0; j < arrWords.length; j++) {
                    if (arrWords[i].equals(arrWords[j])) {
                        count++;
                    }
                }
                counts[wIndex++] = count;
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
