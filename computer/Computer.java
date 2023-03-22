package org.computer;

public class Computer {
	public void computerModel() {
		System.out.println("Apple A series");
	}
	public void computerRam() {
		System.out.println("Computer Ram 8GB");
	}
	public static void main(String[] args) {
		Computer apple=new Computer();
		apple.computerModel();
		apple.computerRam();
	}

}
