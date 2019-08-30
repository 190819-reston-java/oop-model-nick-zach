package playerDatabase;



import java.util.Comparator;

public class PlayerComparison implements Comparator<BasketballPlayer> {

	public int compare(BasketballPlayer o1, BasketballPlayer o2) {

		int out = 0;
		int playerOneAge = o1.getAge();
		int playerTwoAge = o2.getAge();
		out = playerOneAge - playerTwoAge;

		if(out == 0) {
			out = o1.compareTo(o2);
		}
		
		return out;
	}

	

}
