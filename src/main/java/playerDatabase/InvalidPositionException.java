package playerDatabase;



public class InvalidPositionException extends RuntimeException {
	
	public InvalidPositionException () {
		super("A player's position must be: 'PG', 'SG', 'SF', 'PF', or 'C'");
	}
	
	public InvalidPositionException (String message) {
		super(message);
	}

}
