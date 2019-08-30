package playerDatabase;



public abstract class Player {
	
	private String name;	
	private int age;
	private Boolean active;
	
	
	public Player(String name, int age, Boolean active) {
		super();
		this.name = name;
		this.age = age;
		this.active = active;
	}
	
	public Player(String name, int age) {		
		this(name, age, false);
		}
	
	public Player(String name) {
		this(name, 0);
	}
	
	public Player() {
		this("Not Applicable");
	}
	
	public void train() {
		System.out.println(this.name + " is training");
	}

	public void practice() {
		System.out.println(this.name + " is practicing");
	}
	
	public void playGame() { 
		System.out.println(this.name + " is playing in a game!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", active=" + active + "]";
	}
	
	
	

}
