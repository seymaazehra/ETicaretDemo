package nLayeredDemo.core;

import java.util.List;

import nLayeredDemo.business.abstracts.GoogleService;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.business.concretes.UserManager;
import nLayeredDemo.dataAccess.abstracts.UserDao;

import nLayeredDemo.entities.concretes.User;

public class GoogleManager implements GoogleService{

	
	
@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
	public void kayýt(User user) {
		System.out.println(user.getEmail()+" google kayýdý baþarýyla oluþturuldu.");
		
	}



	@Override
	public void kayýt(GoogleService googleService) {
		// TODO Auto-generated method stub
		
	}












	




	


	

	
	

	

	

	

	

	
}
