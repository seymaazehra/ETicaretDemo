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


	
	public void kay�t(User user) {
		System.out.println(user.getEmail()+" google kay�d� ba�ar�yla olu�turuldu.");
		
	}



	@Override
	public void kay�t(GoogleService googleService) {
		// TODO Auto-generated method stub
		
	}












	




	


	

	
	

	

	

	

	

	
}
