package week2.day2;

public class ChangeOddIndexToUpper {
    public static void main(String[] args) {
        
        String test = "changeme";

        char[] chars = test.toCharArray();

        System.out.print("Output: ");
        for (int i = 0; i < chars.length; i++) {
            
            if (i % 2 != 0) {
                
                System.out.print(Character.toUpperCase(chars[i]));
            } else {
                
                System.out.print(chars[i]);
            }
        }
    }
}