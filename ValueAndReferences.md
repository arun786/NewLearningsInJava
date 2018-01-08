# Value and References.

When a primitive type is passed into a method, a copy of the variable is created.

    public class PassingValueByReferences {
        public static void main(String[] args) {
            int localVariable = 10;
            Calculate(localVariable);
            System.out.println(localVariable);
        }
    
        private static void Calculate(int copyOflocalVariable) {
            copyOflocalVariable = copyOflocalVariable * 100;
        }
    }
    
    step 1 : localvariable is first put in stack
    step 2 : copyOflocalVariable is then put in the stack
    step 3 : mutliplication with 100 is then done and copyOflocalVariable is updated.
    step 4 : then copyOflocalVariable is removed from the stack
    step 5 : then local variable is removed, so there are no connection between the two variables.
    
    Therefore the output of the program will be 10 and 1000. 