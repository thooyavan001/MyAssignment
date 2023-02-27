package week2.day1;

public class Mobile {
	public void switchOnMobile(){
		System.out.println("Switch on the mobile");
	}
	public void plugInCharger(){
        System.out.println("Plug in the charger");
    }
    public void unLockMobile(){
        System.out.println("Unlock mobile");
    }
    public void insertSimCard(){
        System.out.println("Insert sim card ");
    }
    public void logIn(){
        System.out.println("Login using Gmail ID");
    }
    public void sync(){
        System.out.println("Sync data");
    }
    public void call(){
        System.out.println("Call");
    }
    public void text(){
        System.out.println("Text");
    }
    public void voiceRecord(){
        System.out.println("Voice record");
    }
    public void camera(){
        System.out.println("Take pictures and videos");
    }
    public void installApplication(){
        System.out.println("Install application");
    }


    public static void main(String[] args) {
        Mobile kumsPhn = new Mobile();
        kumsPhn.logIn();
        kumsPhn.sync();
        kumsPhn.plugInCharger();
        kumsPhn.unLockMobile();
        kumsPhn.insertSimCard();
        kumsPhn.call();
        kumsPhn.text();
        kumsPhn.voiceRecord();
        kumsPhn.camera();
        kumsPhn.installApplication();
    }
}
