package week3.day1;


public class Elements {
 public static void main(String[] args) {
     System.out.println("=== Button Demo ===");
     Button btn = new Button();
     btn.click();
     btn.setText("Submit");
     btn.submit();

     System.out.println("\n=== TextField Demo ===");
     TextField tf = new TextField();
     tf.click();
     tf.setText("Username");
     System.out.println("Retrieved Text: " + tf.getText());

     System.out.println("\n=== CheckBoxButton Demo ===");
     CheckBoxButton cb = new CheckBoxButton();
     cb.click();
     cb.setText("Agree");
     cb.submit();
     cb.clickCheckButton();

     System.out.println("\n=== RadioButton Demo ===");
     RadioButton rb = new RadioButton();
     rb.click();
     rb.setText("Option 1");
     rb.submit();
     rb.selectRadioButton();
 }
}
