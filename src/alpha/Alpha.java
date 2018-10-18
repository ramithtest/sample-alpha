
package alpha;
import java.util.Scanner;
public class Alpha {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Gname x = new Gname();
    System.out.println("Enter Name");
    String temp = input.nextLine();
    
    x.setName(temp);
    x.showMessage();
    
        
    }
    
}
