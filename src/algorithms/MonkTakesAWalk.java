package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonkTakesAWalk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();                 // Reading input from STDIN
		List<String> inputs = new ArrayList<>();
		for(int i=0; i<noOfTestCases;i++) {
			inputs.add(s.next());
		}
		calculateVowels(inputs);
		s.close();
	}

	private static void calculateVowels(List<String> trees) {

		for (String tree : trees) {
			int count = 0;
			for (int i = 0; i < tree.length(); i++) {
				char current = tree.charAt(i);
				switch (current) {
				case 'a':
					count++;
					break;
				case 'A':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'E':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'I':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'O':
					count++;
					break;
				case 'u':
					count++;
					break;
				case 'U':
					count++;
					break;
				}
			}
			System.out.println(count);
		}
	}
}
