public class DenominatorIsZeroException extends Exception {
    public DenominatorIsZeroException()
    {
        super("You cannot divide by zero, terminating program.");
    }
    public DenominatorIsZeroException( String message )
    {
        super(message);
    }
}