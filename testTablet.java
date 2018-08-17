package HW4;

public class testTablet {

	public static void main(String[] args) {
		
		ipad myipad = new ipad(4000,9.7, (short) 128, 5657);
		tablet youripad = new ipad();
		
		youripad.unlockMethod(1234);
		myipad.unlockMethod();
		myipad.itunes();

	}

}
