package week1.day2;

public class TwoWheeler {
		
	//int noOfWheels =2;
	//boolean isPunctured= false;
	//String bikeName="PULSAR";
//	short noOfMirrors=2;
	//long chassisNumber = 9876787897l;
	//double runningKM=8598900.99989;

	
	public int getNoOfWheels(int noOfWheels)
	{
		return noOfWheels;	
	}
		public boolean isPunctured()
		{
			return false;
		}
		public String getBikeName()
		{
			String bikeName="Pulsar 220";
			System.out.println("bikeName = "+bikeName);
			return bikeName;
		}
	public int getNoOfMirrors(int noOfMirrors)
	{
		return noOfMirrors;	
	}
	public long getChassisNumber(long chassisNumber)
	{
		return chassisNumber;	
	}
	public double getRunningKM(double runningKM)
	{
		return runningKM;	
	}	
	
	public static void main(String[] args) {
		System.out.println("Above global variables are Examples of Datatypes");
		TwoWheeler tw = new TwoWheeler();
		System.out.println("noOfWheels = "+tw.getNoOfWheels(2));
		System.out.println("isPunctured = "+tw.isPunctured());
		tw.getBikeName();
		System.out.println("noOfMirrors = "+tw.getNoOfMirrors(1));
		System.out.println("chassisNumber = "+tw.getChassisNumber(9876543210l));
		System.out.println("runningKM = "+tw.getRunningKM(987654321.123456789));
	}

}
