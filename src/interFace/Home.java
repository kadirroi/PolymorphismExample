package interFace;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //interface s�n�f� paren s�n�f oldu�undan bu s�n�f�n tip refrans�n alts�n�flar
	   //aabilmesine imkan sa�land���nda polymorpishm vard�r
		
		Aplication aplication = new Aplication(new EmailService());
		aplication.processMessageService("Merhaba", "asd");
		Aplication aplication2 = new Aplication(new SmsService());
		aplication2.processMessageService("Merhaba", "sda");
		
	}

}
