package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {

		Car carExtends = new Car();
		carExtends.openSunRoof();
		carExtends.turnOnAC();
		carExtends.applyBrake();
		carExtends.soundHorn();

		Auto autoExtends = new Auto();
		autoExtends.handStarter();
		autoExtends.applyBrake();
		autoExtends.soundHorn();
		
		Bajaj bajaExtends = new Bajaj();
		bajaExtends.handStarter();
		bajaExtends.electronicMeter();
		bajaExtends.applyBrake();
		bajaExtends.soundHorn();
		
		
			BMW bmwExtens = new BMW();
			bmwExtens.openSunRoof();
			bmwExtens.turnOnAC();
			bmwExtens.applyBrake();
			bmwExtens.soundHorn();
			bmwExtens.openSunRoof();
			bmwExtens.turnOnAC();
			bmwExtens.autoPark();
		
			Audi audiExtends = new Audi();
			audiExtends.hybridFuel();
			audiExtends.openSunRoof();
			audiExtends.turnOnAC();
	

}
}
