package week1.day2;


public class LearnConstructor {
	
	/*
	 * public LearnConstructor() {
	 * System.out.println("Mesage from Constructor Method");
	 */
	public LearnConstructor(String name) {
		System.out.println("Mesage from Constructor Method is"+ name);
	}

	public static void main(String[] args) {

		LearnConstructor obj=new LearnConstructor(" TestLeaf");
		System.out.println("Mesage from Main Method");
	}

}
