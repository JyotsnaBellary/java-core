public class DomainValidationBO {
	public String validateMailDomain(String mail) {
		String domain = (mail.substring(mail.lastIndexOf('.') + 1));
		if(domain.equals("com") || domain.equals("in") || domain.equals("org") || domain.equals("net"))
			return "Valid email address";
		return "Invalid email address";
	}
}