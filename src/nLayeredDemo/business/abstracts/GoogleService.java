package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;

import nLayeredDemo.entities.concretes.User;

public interface GoogleService {
	//i� s�n�f�n�n interface i =service
		//neyi servis etmek istiyorsak onun oprasyonu yaz�l�r
		List<User> getAll();
		
		

		void kay�t(User user);



		void kay�t(GoogleService googleService);
		
		
}
