// Java program to illustrate 
// Converting a String to a List 
// of Characters 
import java.util.*; 

// Java program to convert 
// a String to a List of Characters 

class convertor { 

	// Function to convert String 
	// to List of Characters 
	public static List<Character> 
	convertStringToCharList(String str) 
	{ 

		// Create an empty List of character 
		List<Character> chars = new ArrayList<>(); 

		// For each character in the String 
		// add it to the List 
		for (char ch : str.toCharArray()) { 

			chars.add(ch); 
		} 

		// return the List 
		return chars; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Get the String to be converted 
		String str = "Geek"; 

		// Get the List of Character 
		List<Character> 
			chars = convertStringToCharList(str); 

		// Print the list of characters 
		System.out.println(chars); 
	} 
} 
