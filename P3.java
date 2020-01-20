//wajp to find area of circumference of circle for which radius is taken using CLA
 

class P3{
	public static void main(String args[]){
		final double PI = 3.14;
		double r = Double.parseDouble(args[0]);
		double circumference = 2* PI* r;
		double area = PI*r*r;
		System.out.println("circumference= " + circumference + " area= " + area );

	}
}
