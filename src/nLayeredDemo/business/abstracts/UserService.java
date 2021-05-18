package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;

import nLayeredDemo.entities.concretes.User;

public interface UserService {
//iþ sýnýfýnýn interface i =service
	//neyi servis etmek istiyorsak onun oprasyonu yazýlýr
	List<User> getAll();
	
	User get(int id);
	void kontrol(User user);

	void kayýt(User user);

	
	
	
	
	
}
