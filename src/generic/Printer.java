package generic;

public class Printer {
	
	public <T> void  printArray(T[] elements) {
	
		for(T e : elements) {
			System.out.println(e+"");
		}
	}

}
