# Make-Java-Easy

### A Library / Package that makes writing java as easy as Python! 

## Info
- All the functions are written in the `makejavaeasy.java` file.
- All the functions are shown and used in the `demo.md` file.

## What the heck is this?
- This is a way to make java easy for beginners. 

### Example
- This is a common way to get input from users in the terminal with Java:                 
```
// Import library
        import java.util.Scanner;
        
        // main method...
        
// Print the input phrase 
        System.out.println("Enter input: ");
// Open scanner for input
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
// Print the input
        System.out.println(userInput);
```

- This takes about 6 lines of code in Java when the same can be done in Python using just 2:
```
userInput = input("Enter input: ")
print(userInput)
```

## MakeJavaEasy solves this problem!
- Simply use the function `getString(String)`:
```
String input = makejavaeasy.getString("Enter input: ");
System.out.println(input);
```
## Voila!
- Just like that, with MakeJavaEasy, you get the simplicity of Python with Java!
