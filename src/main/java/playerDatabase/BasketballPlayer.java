package playerDatabase;



import java.io.Serializable;


public class BasketballPlayer extends Player implements Serializable, Actions {

	public static int playerCount = 0;
	public String position;
	public int jerseyNumber;
	public int playerId;
	
	public BasketballPlayer(String name, String position, int jerseyNumber,int age, boolean active) {
		super(name, age, active);
		
		// Change the position initialization to call the setPosition method
		this.setPosition(position);
		this.jerseyNumber = jerseyNumber;
		playerCount++;
		this.playerId = playerCount;
	}
	
	public BasketballPlayer(String name, String position, int jerseyNumber, int age ) {
		super(name, age, false);
		this.position = position;
		this.jerseyNumber = jerseyNumber;
		playerCount++;
		this.playerId = playerCount;
	}
	
	public BasketballPlayer(String name, int age, boolean active) {
		super(name, age, active);
		playerCount++;
		this.playerId = playerCount;
	}
	
	public BasketballPlayer(String name, int age) {
		this(name, age, false);
		playerCount++;
		this.playerId = playerCount;
	}
	
	public BasketballPlayer(String name) {
		this(name, 0);
		playerCount++;
		this.playerId = playerCount;
	}
	
	public BasketballPlayer() {
		this("no name");
	}
	
	public String getPosition() {
		return position;
	} 

	public void setPosition(String position) {
		// Changed "==" to a .equals() method
		if ((position.equals("PG")) | (position.equals("SG")) | 
			(position.equals("SF")) | (position.equals("PF")) | (position.equals("C"))) {
			this.position = position;
		} else {
			throw new InvalidPositionException();
		}
		
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public static void printNumberOfPlayers() {
		System.out.println("There are " + playerCount + " players in the league.");
	}

	public void dribble() {
		System.out.println(this.getName() + " is dribbling the ball...");
		
	}

	public void dismantle() {
		System.out.println(this.getName() + " is dismantling a franchise!!");		
	}
	
	public void shoot() {
		System.out.println(this.getName() + " is shooting the ball!");		
	}

	@Override
	public String toString() {
		return "BasketballPlayer [Position: " + position + ", JerseyNumber: " + jerseyNumber + ", Player Id: " + playerId
				+ ", Name: " + getName() + ", Active: " + getActive() + ", Age: " + getAge() + "]";
	}

	public int compareTo(BasketballPlayer o) {
		return this.getName().compareTo(o.getName());
	}
	
	
	
	
}
