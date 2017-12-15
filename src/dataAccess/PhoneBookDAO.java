package dataAccess;

import java.time.LocalDate;

import businessObjects.PhoneBookBO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PhoneBookDAO {
	
	public void savePhoneBook(PhoneBookBO user) throws IOException {
		
		String userOutputData = 
				"Phone Number: " + user.getPhone() + "\n" +
				"Name: " + user.getName();
		
		FileOutputStream fileOutput = new FileOutputStream(
				"/Users/lisaciaccio/Desktop/"
				+ user.getName() 
				+ LocalDate.now()
				+ ".txt");
		
		fileOutput.write(userOutputData.getBytes());
		fileOutput.close();
		
	}

}
