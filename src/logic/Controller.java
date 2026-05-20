package logic;

public class Controller {
	private static Controller control = null;
	
	public static Controller getInstance() {
	if(control == null) {
		control = new Controller();
	 }
	return control;
	}
}
