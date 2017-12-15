package service;

import java.io.IOException;

import businessObjects.PhoneBookBO;
import dataAccess.PhoneBookDAO;

public class PhoneBookService {
	
	public String savePhoneBook(PhoneBookBO user) throws IOException {
		
		if(!isUserValid(user)) {
			return "You've entered incorrect data";
		} else {
			PhoneBookDAO dao = new PhoneBookDAO();
			dao.savePhoneBook(user);
			return "You've successfully saved the data";
		}
	}
	
	private boolean isUserValid(PhoneBookBO user) {
		
		if ( user.getPhone().length() != 10) {
			return false;
		} else {
			return true;
		}
	}


}
