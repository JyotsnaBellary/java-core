public class OddEvenBO {
	public String findOddEven(Integer value) {
		if(value % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
}