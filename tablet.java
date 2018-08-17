package HW4;

public abstract class tablet implements ElectronicDevice {
	
	static String input = "touch-screen";
	private int batteryCapacity = 500;
	private double screenSize = 7.0;
	private short storage = 8;
	private int passcode = 1234;
	
		public tablet(int batteryCapacity, double screenSize, short i,int j) {
		
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
		this.storage = i;
		this.passcode = j;
	}
	
	public tablet() {
		
	}
	
	public void unlockMethod(int num) {
		if(this.passcode == num) {
			System.out.println("access granted");
		}else {
			System.out.println("incorrect password");
		}
		
	}
	// this will be implemented by the subclass
	public abstract void power();

	public void inputMethod() {
		
		System.out.println("please use the " + input );
	}
	public void function() {
	
		System.out.println(" to provide a mobile entertainment experience");	
	}

	public static String getInput() {
		return input;
	}
	public static void setInput(String input) {
		tablet.input = input;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public short getStorage() {
		return storage;
	}
	public void setStorage(short storage) {
		this.storage = storage;
	}
	
	public short getPasscode() {
		return (short) passcode;
	}

	public void setPasscode(short passcode) {
		this.passcode = passcode;
	}


	
}
