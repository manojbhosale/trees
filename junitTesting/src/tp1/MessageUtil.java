package tp1;

public class MessageUtil {
	
	private String message;
	
	//constructor
	//@param message to be printedf
	
	public MessageUtil(String m){
		message = m;
	}

	
	//prints the message
	public String printMessage(){
		System.out.println(message);
		return message;
	}
		
	
}
