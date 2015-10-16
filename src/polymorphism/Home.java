package polymorphism;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		Göster(new Engineer());
		
		
	}
  //Polymorpish olduðu kýsým Persone Parent sýnýfýn tipi sub classlarýn nesnelerini atanabilmesidir.
	public static void Göster(Persone persone) {
		
		persone.Display();
	}
	
}
