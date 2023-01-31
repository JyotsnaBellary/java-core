import java.util.regex.Pattern;

public class UserBO {
	public static void validate(User u) throws WeakPasswordException{
		//Your code here
		 // fill the code
		if(u.getPassword().length() < 8 || u.getPassword().length() > 20){
	           throw new WeakPasswordException("Your password is weak");
	       }
		else if(!Pattern.compile("[0-9]").matcher(u.getPassword()).find()) {
			throw new WeakPasswordException("Your password is weak");
		}
		else if(!Pattern.compile("[0-9]").matcher(u.getPassword()).find()) {
			throw new WeakPasswordException("Your password is weak");
		}else if(!Pattern.compile("[0-9]").matcher(u.getPassword()).find()) {
			throw new WeakPasswordException("Your password is weak");
		}else if(!Pattern.compile("[0-9]").matcher(u.getPassword()).find()) {
			throw new WeakPasswordException("Your password is weak");
		}else {
			return;
		}
	}
}
