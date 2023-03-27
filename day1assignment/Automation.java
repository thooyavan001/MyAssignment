package week6.day1assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.Java();
		auto.Selenium();
		
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium - Test Tool");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java - Language");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby - abstract");
		
	}
	

}
