package week1.day1;

public class FibnocciProgram {

	public static void main(String[] args) {
int a=-1, b=1;
for (int i=1;i<=10;i++)
{
	int c=a+b;
	//System.out.println(c);
	a=b;
	b=c;
	System.out.println(c);

}
	}

}
