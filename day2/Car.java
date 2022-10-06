package week1.day2;

public class Car {

	public void printCarName()
	{
		System.out.println("Chevrolet");	
	}
	public int getRegNumber(int regNum)
	{
		return regNum;	
	}
	public String getColor()
	{
		String color="Black";
		System.out.println(color);
		return color;
	}
	public boolean isCarPuncture()
	{
		return false;
	}
	
	public int additon(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	private int subtraction(int sub1, int sub2)
	{
		int sub3=sub2-sub1;
		return sub3;	
	}
	float multiply(float mul1, float mul2, float mul3)
	{
		float multiplyfinal =mul1*mul2*mul3;
		return multiplyfinal;	
	}
	public int division(int div1, int div2)
	{
		int div3 = div1/div2;
		return div3;	
	}
	
	
	public static void main(String[] args) {
		
		Car name=new Car();
		
		int sum=name.additon(10, 20, 30);
		System.out.println(sum);
		int sub3 = name.subtraction(10, 20);
		System.out.println(sub3);
		float multiplyfinal = name.multiply(10, 20,30);
		System.out.println(multiplyfinal);
		
		
		/*
		 * System.out.println(name.additon(10, 20, 30));
		 * System.out.println(name.subtraction(20, 10));
		 * System.out.println(name.multiply(10, 20, 30));
		 * System.out.println(name.division(20, 10));
		 */
		/*
		 * name.printCarName(); System.out.println();
		 * System.out.println(name.getRegNumber(1234)); name.getColor();
		 * System.out.println(name.isCarPuncture());
		 */
	}

}
