## Background 
This calculator uses a single Node class to create a tree structure that is used to perform mathematical operations. Operations are performed in the Node.calculate() method.  Currently only addition and multiplication is supported.
   
## The problem  
Now we want to make this calculator extensible, so that other developers can add new operations.
Modify this class structure so that external can add new operations while respecting good OO practices.
We should be able to distribute this code as a compiled .jar and developers should be able to add new types of operations at runtime.  As an example, demonstrate how subtraction would be added.

## Solution
Used the Factory creational Design Pattern.
* A store (NodeStore.java) has been created as container of the different factories. In our case, we have only added one Factory for simple operators, but doing a refactor, the store could contain as factories as we want.
* NodeFactory: is the factory created and which provide the type of Node depending on the operator type.
* RNode: To avoid the original class replacement, a new Class was created. It is quite similar to the original one where the calculation has been moved into the concret class.
* SumNode, SubstractNode, etc..are the concret classes for each type of nodes.

## How to extend the factory
Anyone can add new operators to the factory.
Steps:
  1. Create new class extending RNode and rewrite the method calculate()       
    `Example: public class DivisionNode extends RNode
    public int calculate()
        return leftNode.calculate()/rightNode.calculate();
    }`                
  2. Update NodeFactory for providing the new RNode type
          
             } else if ("/".equals(operator)) {
                  node = new DivisionNode(value);`

  3. Start using the nodes like the original ones requesting nodes to the factory
  
    `RNode division = store.createNode("/", 0);`