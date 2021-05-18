package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.core.GoogleManager;
import nLayeredDemo.entities.concretes.User;

public interface UserDao {
      void add(User user);
      void dogrulama(User user);
      User get(int id); //þu id li ürünün detayý
      //Product [] getAll();//
      List<User> getAll();//ürünleri listeler
      void kayýt(User user);
      void kayýt(GoogleManager googleManager);
	
	  
      
}
