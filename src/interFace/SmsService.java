package interFace;

public class SmsService implements IMessageService {

	@Override
	public void SendMessage(String msg, String recev) {
		// TODO Auto-generated method stub
		System.out.println("SmsMesg:"+msg);
	}

}
