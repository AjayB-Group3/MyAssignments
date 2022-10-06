package week1.day2;

public class MyCar {

	public static void main(String[] args) {
		Car obj=new Car();
		int sum=obj.additon(10, 20, 30);
		System.out.println(sum);
	 // obj.subtraction(10, 20);   cannot be accessed since its private
		float multiplyfinal = obj.multiply(10, 20,30);
		System.out.println(multiplyfinal);
	}

}
