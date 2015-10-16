package polymorphismAbstratct;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Personel personel = new Personel();
	personel.setFirstName("Kadir");
	personel.setLastName("Kýlýç");
	
	Engineer engineer = new Engineer();
	engineer.setFirstName("Ahmet");
	engineer.setLastName("veli");
		
	  Göster(personel);
	  Göster(engineer);
	}

	public static void Göster(Persone persone)
	{
		persone.Display();
		
	}
	
}
