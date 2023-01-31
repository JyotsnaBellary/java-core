public class Stall {
        //fill your code here
	static String name;
	static String detail;
	static String owner;
	static Integer cost;
	
	public Stall(String name, String detail, String owner, Integer cost) {
		super();
		this.name = name;
		this.detail = detail;
		this.owner = owner;
		this.cost = cost;
	}	
	
	public class GoldStall{
		  Integer tvSet;

		public GoldStall(Integer tvSet) {
			super();
			this.tvSet = tvSet;
		}
		
		public class PlatinumStall{
			Integer projector;
			
			
			public PlatinumStall(Integer projector) {
				super();
				this.projector = projector;
			}

			public void display() {
				System.out.println("Stall Name:" + Stall.name);
				System.out.println("Details:" + Stall.detail);
				System.out.println("Owner Name:" + Stall.owner);
				System.out.println("TV Sets:" + tvSet);
				System.out.println("Projectors:" + projector);
				System.out.println("Total Cost:" + (Stall.cost + tvSet*100 + projector*500));
			}
		}
		
	}
	
	
	
	
}