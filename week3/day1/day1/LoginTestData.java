package week3.day1;

class LoginTestData extends TestData {

  
    @Override
   public void enterCredentials() {
        super.enterCredentials();  // Call the superclass method
        
    }

    public void enterUsername() {
        System.out.println("Entering username...");
    }

    public void enterPassword() {
        System.out.println("Entering password...");
    }
}



