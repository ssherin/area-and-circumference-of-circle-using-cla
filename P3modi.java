//wajp to find area of circumference of circle for which radius is taken using CLA
  //println cannot do precision so we go for printf

class P3modi{
	public static void main(String args[]){
		final double PI = 3.14;
		double r = Double.parseDouble(args[0]);
		double circumference = 2* PI* r;
		double area = PI*r*r;
		//System.out.println("circumference= " + circumference + " area= " + area );   //using println
		

		System.out.printf("circumference=  %.2f\n", circumference);                    //using printf
		System.out.printf("area=  %.4f\n" , area );

		
	}
}
 
