package assessment2;

public class TeranaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			            int a = 10;
				        int b = 20;
				        int c = 30;
				        int d = 25;
				        int greatest = (a > b) 
				                                ? (a > c) 
				                                    ? (a > d ? a : d) 
				                                    : (c > d ? c : d) 
				                                : (b > c) 
				                                    ? (b > d ? b : d) 
				                                    : (c > d ? c : d);

				                System.out.println("The greatest number is: " + greatest);
				            }
		


	}


