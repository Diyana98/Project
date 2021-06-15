
public class Pawn {

	private String sign;
	private int attack;
	private int defence;
	private int health;
	private int distance;
	private int speed;
	
	//da sloja cwqt 
	public String getSign() {
		return this.sign;
	}
	
	public Pawn(String sign,int attack,int defence, int health,int distance,int speed) {
		
		attack=this.attack;
		sign=this.sign;
		defence=this.defence;
		health=this.health;
		distance=this.distance;
		speed=this.speed;
	}
}
