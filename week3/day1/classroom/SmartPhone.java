package week3.day1.classroom;

public class SmartPhone extends AndroidPhone {

	 public void connectWhatsapp() {
		System.out.println("connect whatsapp");

	}
	 
	 protected void takeVideo() {
			System.out.println("Take Video in Smart Phone");

		}
	public static void main(String[] args) {
		
		AndroidPhone A = new AndroidPhone();
		A.saveContact();
		A.makeCall();
		A.sendMessage();
		A.takeVideo();
		SmartPhone S = new SmartPhone();
		S.connectWhatsapp();
	}
	

}
