import java.util.List;

import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.business.concretes.UserManager;
import nLayeredDemo.core.EmailDogrulama;
import nLayeredDemo.core.GoogleManager;
import nLayeredDemo.dataAccess.abstracts.UserDao;

import nLayeredDemo.entities.concretes.User;


public class Main {





	public static void main(String[] args) {
		User user1=new User("zehragmail.com","3884557","zehra","kutukcu","1234567");
        User user2=new User("engindemirog@gmail.com", "678967", "engin", "demirog", "6789067");
       
        
       
      
        UserService userService=new UserManager(new UserManager(new UserManager())); 
		userService.kontrol(user1);
        userService.kontrol(user2);
        userService.kay�t(user1);
        userService.kay�t(user2);
        
					
					
					
       // UserService userService2=new UserManager(new UserManager(new GoogleManager()));
       //userService2.kay�t(user1);
      //  userService2.kay�t(user2);
        
       
        
       
      
        
       
        
   
        
        
	

}
}
