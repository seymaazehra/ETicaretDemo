package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;
import nLayeredDemo.entities.concretes.User;

public interface UserDao {
      void add(User user);
      void dogrulama(User user);
      User get(int id); //�u id li �r�n�n detay�
      //Product [] getAll();//
      List<User> getAll();//�r�nleri listeler
      void kay�t(User user);
      void kay�t(GoogleManager googleManager);
	
	  
      
}
