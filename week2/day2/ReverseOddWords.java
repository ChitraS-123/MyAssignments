package week2.day2;

public class ReverseOddWords {
	public static void main(String[] args) {
       
        String test = "I am a software tester";

        String[] words = test.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
            } else {
                
                System.out.print(words[i]);
            }
            System.out.print(" ");
        }
    }

}
