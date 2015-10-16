package interFace;

public class EmailService implements IMessageService {

	@Override
	public void SendMessage(String msg, String recev) {
		// TODO Auto-generated method stub
		System.out.println("EmailMesg:"+msg);
	}

	
	
}
