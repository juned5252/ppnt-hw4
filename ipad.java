package HW4;

public class ipad extends tablet{
	
	 static String brand = "apple";
	 static String os = "IOS";
	
	

	public ipad() {
		
	}

	public ipad(int batteryCapacity, double screenSize, short i,int j) {
		super(batteryCapacity, screenSize, i, j);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void power() {
		System.out.println("USB-Type C");
	}
    
	// method overloaded from tablet class
	public void unlockMethod() {
		System.out.println("use faceID or fingerprint to unlock");
	}
	
	public void itunes() {
		System.out.println("opening itunes library");
	}
	
	

}
