public class Hero implements GameStatus
{
    // fill your code
	int life;

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public Hero() {
		
	}

	public Hero(int life) {
		super();
		this.life = life;
	}

	public void status() {
		// TODO Auto-generated method stub
		if(getLife() > 0) {
		System.out.println("You have " + getLife() + " lives left");
		life = life - 1;
		} else {
			System.out.println("You have 0 lives left");
			System.out.println("You lose the GAME !!!");
		}
	}
    
	
	
}