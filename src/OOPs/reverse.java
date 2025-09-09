package OOPs;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String original = "Hello World";
		 Scanner scanner = new Scanner(System.in);

	        // Take input from user
	        System.out.print("Enter a string: ");
	        System.out.print("Enter a string2: ");


	        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
		scanner.close();
		
//		 String original = "Hello World";
//	        char[] chars = original.toCharArray();
//	        int left = 0, right = chars.length - 1;
//	        while (left < right) {
//	            char temp = chars[left];
//	            chars[left] = chars[right];
//	            chars[right] = temp;
//	            left++;
//	            right--;
//	        }
//	        String reversed = new String(chars);
//	        System.out.println("Reversed: " + reversed);

	}

}
