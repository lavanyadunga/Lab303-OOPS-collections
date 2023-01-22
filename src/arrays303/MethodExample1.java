package arrays303;

public class MethodExample1 {

   public int sum(int x,int y) {
	  int z=x+y;
	   
	   return z;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25;
        int num2 = 15;
        MethodExample1 obj = new MethodExample1();
       int result =obj.sum(num1,num2);
        System.out.println("Sum is: " + result);
        
	}

}
