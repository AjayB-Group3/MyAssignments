package week1.day2;

public class ArraysIntersection {

	public static void main(String[] args) {

		int[] num1 = {1,2,3,5,6,7,12};
		int[] num2 = {3,8,10,5};
		for(int i=0;i<(num1.length);i++){
			for(int j =0;j<(num2.length);j++){
				if(num1[i]==num2[j]){
					System.out.println("The Array intersection Numbers are " +num1[i]);
				}
			}
		}
		

	}

}
