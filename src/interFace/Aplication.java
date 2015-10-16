package interFace;

public class Aplication {

	private IMessageService iMessageService;

   public Aplication(IMessageService messageService){
	   
	   this.iMessageService= messageService;
	   
   } 
	

   public void processMessageService(String msg,String recev)
   {
	   this.iMessageService.SendMessage(msg, recev);
	   
   }
	
	
	
}
