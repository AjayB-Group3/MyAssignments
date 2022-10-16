package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("16 inch screen");
	}
	
	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();
	}
	

}
