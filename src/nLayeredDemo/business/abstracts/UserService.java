package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;

import nLayeredDemo.entities.concretes.User;

public interface UserService {
//i� s�n�f�n�n interface i =service
	//neyi servis etmek istiyorsak onun oprasyonu yaz�l�r
	List<User> getAll();
	
	User get(int id);
	void kontrol(User user);

	void kay�t(User user);

	
	
	
	
	
}
