package sec02.exam02;

public class Message {
	public String command; // 메시지를 어떻게 처리할지 
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}
