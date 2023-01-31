public class ReverseJUnit {
	public void createBoInstance() {
		//fill the code
		ReverseBO reverseBO;
	}
	public void testReverse() {
		//fill the code
	}
}
class ReverseChecker {
	public static Matcher<String> checkReverse(final String string) {
		return new TypeSafeMatcher<String>() {
			public void describeTo(Description description) {
				//fill the code
			}
			protected boolean matchesSafely(String n) {
				//fill the code
			}
			public void describeMismatchSafely(final String str, final Description mismatchDescription) {
				//fill the code
			}
		};
	}
}
