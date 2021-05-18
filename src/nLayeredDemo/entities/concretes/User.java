package nLayeredDemo.entities.concretes;

public class User {
    private String email;
    private String sifre;
    private String ad;
    private String soyad;
    private String dogrulamaKodu;
    
	public User(String email, String sifre, String ad, String soyad, String dogrulamaKodu) {
		super();
		this.email = email;
		this.sifre = sifre;
		this.ad = ad;
		this.soyad = soyad;
		this.dogrulamaKodu = dogrulamaKodu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDogrulamaKodu() {
		return dogrulamaKodu;
	}

	public void setDogrulamaKodu(String dogrulamaKodu) {
		this.dogrulamaKodu = dogrulamaKodu;
	}
    
    
    
}
