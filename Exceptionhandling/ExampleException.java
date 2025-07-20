/*
How it works:

The main method sets an age (e.g., 16).

It calls checkAge(age) inside a try block.

If age < 18, checkAge throws an IllegalArgumentException.

The catch block handles the exception and prints the error message.

The finally block always executes, showing that resource cleanup or final steps can be performed here.

Output when age = 16:
Exception caught: Age must be 18 or older. Provided: 16
Validation attempt finished (finally block runs always).

*/public class AgeChecker {
    public static void main(String[] args) {
        int age = 16; // Try changing this value to 18 or above

        try {
            checkAge(age);  // Might throw exception
            System.out.println("Access granted. Your age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation attempt finished (finally block runs always).");
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            // Throwing an exception explicitly
            throw new IllegalArgumentException("Age must be 18 or older. Provided: " + age);
        }
    }
}
