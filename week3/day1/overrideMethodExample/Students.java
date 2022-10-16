package overrideMethodExample;

public class Students {

	public void getStudentInfo(long id) {
		System.out.println("student id" + id);
		
	}
	
	public void getStudentInfo(long id, String name) {
		System.out.println("student id" + id);
		System.out.println("student name" + name);
		
	}
	
	public void getStudentInfo(String phonenumber, String email) {
		System.out.println("student name" +phonenumber );
		System.out.println("student email" +email );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students studentDetail = new Students();
		studentDetail.getStudentInfo(801599199L);
		studentDetail.getStudentInfo(8015991979L, "Ajay");
		studentDetail.getStudentInfo("8015991979", "ajaymar892@GMAIL.COM");
		

	}
}
