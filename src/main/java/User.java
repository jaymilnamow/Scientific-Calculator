import java.util.Scanner;

/**
 * Created by jaymilnamow on 5/20/16.
 */
public class User {

    Scanner input = new Scanner(System.in);

    public int chooseOperation(){
        return input.nextInt();
    }

    public double promptUserForInput(){
        System.out.println("Enter a value:");
        return input.nextDouble();
    }

}
