## Background 
This calculator uses a single Node class to create a tree structure that is used to perform mathematical operations. Operations are performed in the Node.calculate() method.  Currently only addition and multiplication is supported.
   
## The problem  
Now we want to make this calculator extensible, so that other developers can add new operations.
Modify this class structure so that external can add new operations while respecting good OO practices.
We should be able to distribute this code as a compiled .jar and developers should be able to add new types of operations at runtime.  As an example, demonstrate how subtraction would be added.

## Solution
Used the Iterator Design Pattern
