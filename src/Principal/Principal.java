package Principal;

import Utils.Contact;
public class Principal extends Contact{
	private String password;
	
	public Principal(String firstName, String lastName, long phoneNumber, String eMail, String password) {
		super(firstName, lastName, phoneNumber,eMail);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
