package polymorphismAbstratct;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Personel personel = new Personel();
	personel.setFirstName("Kadir");
	personel.setLastName("K�l��");
	
	Engineer engineer = new Engineer();
	engineer.setFirstName("Ahmet");
	engineer.setLastName("veli");
		
	  G�ster(personel);
	  G�ster(engineer);
	}

	public static void G�ster(Persone persone)
	{
		persone.Display();
		
	}
	
}
