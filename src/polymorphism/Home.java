package polymorphism;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		G�ster(new Engineer());
		
		
	}
  //Polymorpish oldu�u k�s�m Persone Parent s�n�f�n tipi sub classlar�n nesnelerini atanabilmesidir.
	public static void G�ster(Persone persone) {
		
		persone.Display();
	}
	
}
