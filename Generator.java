import java.util.*;

public class Generator {
    Scanner sc = new Scanner(System.in);

    public void requestPassword() {
        
        boolean IncludeUpper = false;
        boolean IncludeLower = false;
        boolean IncludeNum = false;
        boolean IncludeSym = false;
        boolean correctParams = false;

        System.out.println();
        System.out.println("Hello, welcome to the Password Generator :) answer"
                + " the following questions by Yes or No \n");
        String input="",Small_chars="", Capital_chars="",numbers="",symbols="";
        int len=0 ;

        do {
            System.out.println("Do you want Lowercase letters \"abcd...\" to be used? ");
            input = sc.nextLine();
            if (isInclude(input)){
                IncludeLower = true;
                Small_chars = "abcdefghijklmnopqrstuvwxyz";
            }
            System.out.println();

            System.out.println("Do you want Uppercase letters \"ABCD...\" to be used? ");
            input = sc.nextLine();
            if (isInclude(input)){ 
                IncludeUpper = true;
                Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            }
            System.out.println();

            System.out.println("Do you want Numbers \"1234...\" to be used? ");
            input = sc.nextLine();
            if (isInclude(input)){
                IncludeNum = true;
                numbers = "0123456789";
            }
            System.out.println();

            System.out.println("Do you want Symbols \"!@#$...\" to be used? ");
            input = sc.nextLine();
            if (isInclude(input)){
                 IncludeSym = true;
                 symbols = "!@#$%^&*_=+-/.?<>)";
            }
            System.out.println();

            //No Pool Selected
            if (!IncludeUpper && !IncludeLower && !IncludeNum && !IncludeSym) {
                System.out.println("You have selected no characters to generate your " +
                        "password at least one of your answers should be Yes.");
                correctParams = true;
                System.out.println();
            }
            else{
                System.out.println("Great! Now enter the length of the password");
                len = sc.nextInt();
                System.out.println();
            }

        }while (correctParams);
        
            String values = Capital_chars + Small_chars + numbers + symbols;
      
            // Using random method
            Random rndm_method = new Random();
            char[] password = new char[len];
      
            for (int i = 0; i < len; i++)
            {
                password[i] = values.charAt(rndm_method.nextInt(values.length()));
            }
            System.out.println("Your Password: -   ");
            System.out.println("---------------------");
            System.out.print(password);
            System.out.println("\n---------------------");  
            System.out.println("                              by: - Mitendra Singh Tomar");
  
    }

    private boolean isInclude(String Input) {
        if (Input.equalsIgnoreCase("yes")) {
            return true;
        } else if (!Input.equalsIgnoreCase("no")) {
            System.out.println("You have entered something incorrect let's go over it again. \n");
            }
            return false;
    }

   
}
