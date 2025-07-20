## Throw

__Purpose__ Used to explicitly create and throw an exception (object) in your code at runtime

__How it Works__ You use throw followed by a new Exception object (usually with a message).

_NOTES_

Only one exception can be thrown at a time using throw.

The type must be a subclass of Throwable (Exception or Error).

The flow of execution stops at the throw statement and looks for an appropriate catch block.

__CODE__
     
       if (age < 0) {
       
              throw new IllegalArgumentException("Age cannot be negative!");
    
       }

## Throws

__Purpose__ Declares in a method’s signature that the method might throw certain exceptions, informing callers to handle or further declare them.

__How it Works__ Placed in the method definition after the parameter list.

_NOTES_

Used for checked exceptions (must be handled or declared, e.g., IOException).

Can list multiple exceptions, separated by commas.

Does not actually throw any exceptions itself—it only tells the compiler that exceptions may occur.


__CODE__

              public void readFile() throws IOException {
                    // code that might throw IOException
               }


## Throw vs Throws 

| **Feature**        | **throw**                                         | **throws**                                      |
|--------------------|---------------------------------------------------|-------------------------------------------------|
| **_Purpose_**      | Actually throws an exception at runtime           | Declares possible exceptions in method header    |
| **_Placement_**    | Inside method or block                            | With method signature (after parameters)         |
| **_Used For_**     | Generating exception objects                      | Informing callers about possible exceptions      |
| **_How Many?_**    | Only one exception at a time                      | Can declare multiple exceptions                  |
| **_Example_**      | `throw new IOException("error");`                 | `void foo() throws IOException { ... }`          |
| **_Who Uses?_**    | Code (inside method/body)                         | Method definition/caller                         |
| **_Exception Type_**| Checked or unchecked                             | Mainly checked exceptions                        |
| **_Function_**     | Causes method to exit at that point, searches for handler | Pushes handling responsibility up the call stack |

**Summary**

___throw___: Used when you want to throw an exception yourself.

___throws___: Used to announce that a method may throw certain exceptions that callers must be aware of.            
