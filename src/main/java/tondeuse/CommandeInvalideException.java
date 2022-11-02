package tondeuse;

public class CommandeInvalideException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public CommandeInvalideException(String message) {

	super(message);
    }
}