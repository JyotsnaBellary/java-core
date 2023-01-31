public class Villain implements GameStatus
{
	
	int damage;

	public Villain(int damage) {
		super();
		this.damage = damage;
	}

	public Villain() {}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		if(getDamage() < 100) {
		System.out.println("The Villain Damage level is :" + getDamage());
		damage = damage + 50;
	} else {
		System.out.println("\"The Villain Damage level is :\" + getDamage()");
		System.out.println("----GAME OVER----");
		System.out.println("YOU WINS!!!");
	}
    //fill your code
	}
	
}