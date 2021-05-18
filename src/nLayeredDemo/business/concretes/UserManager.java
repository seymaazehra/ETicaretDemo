package nLayeredDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import nLayeredDemo.business.abstracts.GoogleService;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.core.EmailDogrulama;
import nLayeredDemo.core.EmailManager;
import nLayeredDemo.core.GoogleManager;
import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;



public class UserManager implements UserService{
	
    private UserDao userDao;
    private GoogleManager googleManager;
	
   
    

	public UserManager(UserDao userDao, GoogleManager googleManager) {
		super();
		this.userDao = userDao;
		this.googleManager = googleManager;
	}


	public UserManager(UserManager userManager) {
		// TODO Auto-generated constructor stub
	}


    public UserManager() {
		// TODO Auto-generated constructor stub
	}


	public UserManager(GoogleManager googleManager2) {
		// TODO Auto-generated constructor stub
	}


	private static List<String> emailList = new ArrayList<String>();
	//private List<String> sifreList = new ArrayList<String>();

	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}
	 
   
      @Override
	
	public void kontrol(User user) {
		if(isEmailValid(user.getEmail())!=true) {
			System.out.println(user.getAd()+" girilen email adresi baþkasý tarafýndan kullanýlýyor lütfen baþka giriniz: ");
		}else {
			System.out.println(user.getAd()+user.getSoyad()+" email adresiniz onaylandý.Email adresinize dogrulaama kodu gönderildi. ");
		}
		
		if(user.getSifre().length()<6) {
			System.out.println(user.getAd()+" sifreniz 6 haneden az olmamalýdýr, kayýt oluþturulamadý");
			return;
		}else {
			System.out.println(user.getAd()+" sifre dogru! ");
		}
		if(user.getSoyad().length()<=2 || user.getSoyad().length()<=2) {
			System.out.println(user.getAd()+" ad ve soyad uzunluklarý 2 karakterden az olamaz!");


		}
		
	
		
	}
     

	
	

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	


	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	public void kayýt(GoogleService googleService) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void kayýt(User user) {
		// TODO Auto-generated method stub
		
	}


	



	
	
	
}
	
	
	
