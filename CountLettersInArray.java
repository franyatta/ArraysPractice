import java.util.*;

public class CountLettersInArray {

	public static void main(String[] args) {

		char[] chars = createArray();

		System.out.println("The lowercase letters are: ");
		displayArray(chars);

		int[] counts = countLetters(chars);

		System.out.println("The occurances of each letter are: ");
		displayCounts(counts);
	}

// get random letters
	public static char[] createArray() {
		char[] chars = new char[100];
		Random random = new Random();
		for (int i = 0; i < chars.length; i++)
			chars[i] = (char) (random.nextInt(26) + 97);
		return chars;
	}

	public static void displayArray(char[] chars) {
		// Display characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}

	// count occurances of each letter
	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++)
			chars[chars[i] - 'a']++;
		return counts;
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char) (i + 'a'));
			else
				System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
		}
	}
}
