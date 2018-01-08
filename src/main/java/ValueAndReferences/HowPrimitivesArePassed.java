package ValueAndReferences;

/**
 * when a value pass into the method a copy is passed.
 *
 */
public class HowPrimitivesArePassed {
    public static void main(String[] args) {
        int localVariable = 10;
        Calculate(localVariable);
        System.out.println(localVariable);
    }

    private static void Calculate(int localVariable) {
        localVariable = localVariable * 100;
    }
}
