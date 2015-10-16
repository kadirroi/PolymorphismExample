package interFace;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //interface sýnýfý paren sýnýf olduðundan bu sýnýfýn tip refransýn altsýnýflar
	   //aabilmesine imkan saðlandýðýnda polymorpishm vardýr
		
		Aplication aplication = new Aplication(new EmailService());
		aplication.processMessageService("Merhaba", "asd");
		Aplication aplication2 = new Aplication(new SmsService());
		aplication2.processMessageService("Merhaba", "sda");
		
	}

}
