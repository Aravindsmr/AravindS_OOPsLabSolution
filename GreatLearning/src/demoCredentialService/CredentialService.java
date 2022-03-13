package demoCredentialService;


import java.util.Random;


public class CredentialService {
    private String domain = "abc.com";

    // method to assign email and pass and display it on the console
    public void showCredentials(String name, String dept) {
    	
        Random random = new Random();   // to generate a random Employee ID.

        String email = generateEMail(name, dept);
        String pass = generatePassword();

        System.out.println("\n Below are the Credentials of your Employee ID 000" + random.nextInt(99));
        System.out.println("\n Email - " + email);
        System.out.println(" Password - " + pass);
    }

    
    // method to generate Email
    public String generateEMail(String fullname , String dept) {
        return fullname.toLowerCase() + "@" + dept + "." + domain;
    }

    
    // method to generate password
    public static String generatePassword() {

        final String lett = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*_=+-/.?<>)0123456789";

        Random random = new Random();
        StringBuilder pass = new StringBuilder();


        for (int i = 0; i < 8; i++) {     // each iteration of the loop randomly chooses a character from the given Letters

            int randomInt = random.nextInt(lett.length());
            pass.append(lett.charAt(randomInt));
        }

        return pass.toString();
    }
}
