**1.What is the parent class of all exception classes in Java?**

 **ANS:** *Throwable*-root class of exception 
 
-> * Exception*- direct subclass of throwable and parent of most exception types
            
             -custom exceptions
             -checked exceptions(IO ,SQL)
             - unchecked exceptions(Runtime,Arithmetic,NullPointer)     
             
 ->Error
 
---

**2.Finally block use in try-catch-finally construct in Java?**

**ANS:** 

->The finally block in Java is designed to run code regardless of whether an exception was thrown or caught in the preceding try or catch blocks

 Key Points 
 
   -The finally block always executes after the try (and catch, if present), no matter if an exception occurred, was handled, or if code completes without error. 
        
  -This makes finally ideal for tasks that must always happen (such as **closing files, releasing resources, or displaying messages**)—even if an error interrupts the normal flow.
       
  -Even if you include a return or throw an exception inside the ty or catch, the finally block will still run.   
     
-> If the JVM terminates (due to System.exit(), a fatal error, or external interruption), the finally block will not execute.

 ---       

**3. How are custom exceptions done in java?**

**ANS:**   
-> By **Extending** Exception class

     EX: `public class MyCustomException extends Exception {
     
             public MyCustomException(String message) {
             
                                 super(message);
                                 
              }
              
            }`

---

**4.Throw keyword and its working?**

**ANS:**

 -> The throw keyword is used when you want to create and throw an exception manually from your code, whether it’s a built-in exception or a custom one.
         
 -> This action interrupts the normal flow of the program and Java Runtime transfers control to the nearest catch block that can handle that type of exception
        
 -> If no matching catch block is found, the program terminates and prints a stack trace.


---

**5.Multiple catch blocks in Java?**

**ANS:** The order of catch blocks matters:

-When using multiple catch blocks after a *single try*, each catch block is checked in sequence to see if it matches the type of the thrown exception.

-*The first matching catch block is executed; the rest are skipped.*

-Always place catch blocks for *more specific exceptions* (i.e., subclasses) **before** more *general exceptions* (i.e., parent classes).

Ex: FileNotFoundException is a subclass of IOException, which in turn is a subclass of Exception.

          try {

                 // risk code
    
               } catch (FileNotFoundException e)( // Most specific

                  // handle file issues
    
               } catch (IOException e) {  // More general
          
                  // handle general IO issues
               
               } catch (Exception e) {   // Most general
          
                  // handle anything else
               }

---

**6.Describe accurately the relationship and differences between final, finally, and finalize in Java?**

**ANS:**

**_Final_**-A keyword used to make variables constants (can't be reassigned), prevent method overriding, or prevent subclassing of a class.

Example: final int x = 10;

**_Finally_**-A block used in exception handling—placed after try/catch. The code inside always executes, regardless of whether an exception occurred.

Used for cleanup operations (like closing files/resources).

**_Finalize_**-A method that belongs to the __Object class__. It's called by **the garbage collector** _before_ an object is collected, giving you a last chance to release resources (rarely overridden in modern Java).
