import java.util.Scanner;

public class makejavaeasy {

    // Function to take string input
    static String getString(String inputStr) {
        // Print the input phrase 
        System.out.println(inputStr);
        // Open scanner for input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        // return the input so it can be accessible
        return userInput;
    }
    
}