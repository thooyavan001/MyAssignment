package system;

import org.computer.Computer;

public class DeskTop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is 22inch");
	}
	public static void main(String[] args) {
		DeskTop system=new DeskTop();
		system.desktopSize();
		system.computerModel();
		system.computerRam();
	}

}
