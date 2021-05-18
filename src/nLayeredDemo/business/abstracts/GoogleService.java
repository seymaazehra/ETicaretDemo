package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;

import nLayeredDemo.entities.concretes.User;

public interface GoogleService {
	//iþ sýnýfýnýn interface i =service
		//neyi servis etmek istiyorsak onun oprasyonu yazýlýr
		List<User> getAll();
		
		

		void kayýt(User user);



		void kayýt(GoogleService googleService);
		
		
}
