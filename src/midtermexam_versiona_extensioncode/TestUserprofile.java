package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 * This class Software Design Fundamentals
 *
 * @author Matthew Szablowski
 */
public class TestUserprofile {

    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your name: ");
         String userId = sc.nextLine();
         System.out.println("Choose your favourite genre: Comedy, Drama, Action, Mystery?");
         System.out.println("Type your favourite genre: ");
         String genre = sc.nextLine();
         
         UserProfile usergenre  = new UserProfile(userId,genre);
         System.out.println("Your userProfile was created.");
    }
    
    
}
