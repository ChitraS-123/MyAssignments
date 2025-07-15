package week2.day2;

public class CountCharacter {
	
	public static void main(String[] args) {
        
        String input = "TestLeaf";
        
        int count = 0;

        char[] characters = input.toCharArray();

        for (char ch : characters) {
            
            if (ch == 'e') {
                count++;  
            }
        }
        System.out.println("Number of occurrences of 'e': " + count);
    }

}
