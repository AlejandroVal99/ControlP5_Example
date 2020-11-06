package control;

import model.Logic;

public class MainController {
	private Logic logic;
	public MainController() {
		logic = new Logic();
	}
	public void getInfoUser(String username, String password, String email) {
		
		logic.registerNewUser(username,password,email);
		
	}

}
