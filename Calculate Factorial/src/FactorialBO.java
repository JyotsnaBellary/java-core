public class FactorialBO {
	public long calculateFactorial(int n) {
		long val = 1;
		for(int i=1;i<=n;i++) {
			val*=i;
		}
		return val;
	}
}