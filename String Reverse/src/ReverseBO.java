public class ReverseBO {
	public String reverseString(String str) {
		int len = str.length();
        char[] rev = new char[len];
        for (int i = 0; i < str.length(); i++) {
        	rev[--len] = str.charAt(i);
        }
        return new String(rev);
	}
}