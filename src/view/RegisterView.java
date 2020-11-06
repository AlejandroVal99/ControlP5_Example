package view;

import control.MainController;
import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;

public class RegisterView {

	private MainController mainController;
	private String[] inputs;
	private String username, password, confirPassword, email;
	private PApplet app;
	private ControlP5 cp5;

	public RegisterView(PApplet app) {
		// TODO Auto-generated constructor stub
		mainController = new MainController();
		this.app = app;

		cp5 = new ControlP5(app);
		inputs = new String[4];

		// Declarar arrglo de inputs
		inputs[0] = "username";
		inputs[1] = "password";
		inputs[2] = "confirPassword";
		inputs[3] = "email";

		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 100, 30 + (i * 70)).setSize(200, 40)
					.setAutoClear(true);
		}

	}

	public void drawScreen() {
		drawButton();
	}

	public void drawButton() {
		app.rect((app.width / 2) - 40, app.height - 60, 80, 30);
	}

	public void getInfoUser() {
		if (app.mouseX > 210 && app.mouseX < 290 && app.mouseY > 440 && app.mouseY < 470) {
			System.out.println("Click on btn");

			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirPassword = cp5.get(Textfield.class, "confirPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();
			boolean goodPassword = !password.equals("");
			// System.out.println(username + " "+ password + " "+ confirPassword+ " "+
			// email);

			if (goodPassword && password.equals(confirPassword)) {
				mainController.getInfoUser(username, password, email);

			}

			cp5.get(Textfield.class, "username").setText("");
			cp5.get(Textfield.class, "password").setText("");
			cp5.get(Textfield.class, "confirPassword").setText("");
			cp5.get(Textfield.class, "email").setText("");

		}
	}

}
