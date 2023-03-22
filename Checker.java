import java.util.*;

public class Checker {
    Scanner sc = new Scanner(System.in);
    public int CharType(char C){
        int val=0;

        // Char is Uppercase Letter
        if ((int) C >= 65 && (int) C <= 90)
            val = 1;
            
        // Char is Lowercase Letter
        else if ((int) C >= 97 && (int) C <= 122) {
            val = 2;
        }

        // Char is Digit
        else if ((int) C >= 60 && (int) C <= 71) {
            val = 3;
        }

        // Char is Symbol
        else {
            val = 4;
        }

        return val;
    }

    public void check() {
        
        System.out.println();
        System.out.print("Enter Your password: - ");
        String s = sc.nextLine();
       // sc.close();
        

        boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int Score = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            type = CharType(c);

            if (type == 1) UsedUpper = true;
            if (type == 2) UsedLower = true;
            if (type == 3) UsedNum = true;
            if (type == 4) UsedSym = true;
        }

        if (UsedUpper) Score += 1;
        if (UsedLower) Score += 1;
        if (UsedNum) Score += 1;
        if (UsedSym) Score += 1;

        if (s.length() >= 8) Score += 1;
        if (s.length() >= 16) Score += 1;

       
        if (Score == 6) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                System.out.println("RESULT: -  This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        } else if (Score >= 4) {
            System.out.println("----------------------------------------------------------------------");
                System.out.println("RESULT: -  This is a good password :) but you can still do better");
            System.out.println("-----------------------------------------------------------------------");
        } else if (Score >= 3) {
            System.out.println("------------------------------------------------------------------");
                System.out.println("RESULT: -  This is a medium password :/ try making it better");
            System.out.println("--------------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------------");
                System.out.println("RESULT: -  This is a weak password :( definitely find a new one");
            System.out.println("----------------------------------------------------------------------");
        }

        
    }

}
