package arrays303;

public class Lamp {
	 boolean isOn;
	
	public  void turnOn() {
		isOn=true;
		System.out.println("light on ? " + isOn);
	}
	 public  void turnOff() {
		isOn = false;
		System.out.println("light on ? " + isOn);
		
	 }
	  
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp led = new Lamp();
        Lamp halogen = new Lamp();
			led.turnOn();
			halogen.turnOff();
	}

}
