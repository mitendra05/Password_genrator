import java.util.*;

public class Menu {
    Scanner keyword = new Scanner(System.in);
    public void menuheading(){
        System.out.println();
        System.out.println();
        System.out.println("                     $$ Welcome to *Mitendra* passsword service $$ ");
        menuitems();
    }
    private void menuitems(){
       System.out.println();
       System.out.println("1) Enter 1 for Genrate Password: ");
       System.out.println("2) Enter 2 for Check Password: ");
       System.out.println("3) Enter 3 for Information: ");
       System.out.println("4) Enter 4 Quit: "); 
       System.out.println();
       System.out.println(" *Only Integers please* ");
       System.out.print("Please enter your choice: ");
       
       int c = keyword.nextInt();
        menu(c);
    }

    private void menu(int c){
        Information info = new Information();
        Checker check = new Checker();
        Generator generate = new Generator();
        
       switch(c){
        case 1:
            generate.requestPassword();
            menuitems();
        break;
        case 2:
            check.check();
            menuitems();
        break;
        case 3:
            info.info();
            menuitems();
        break;
        case 4:
            System.exit(0);
        break;
        default:
            System.out.println("Closing the program bye bye!");
        break;
       }
     }
}
