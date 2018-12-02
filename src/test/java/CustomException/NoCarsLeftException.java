package CustomException;

public class NoCarsLeftException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoCarsLeftException(String message) {
		super(message);
	}

}
