package arrays303;

import java.util.Arrays;

public class ExtendedArray {

	public static void main(String[] args) {
		int [] list= {1,2,3,4,5};
		
		 int [] newlist= Arrays.copyOf(list, 8);
        System.out.println(newlist);
        
	}

}
