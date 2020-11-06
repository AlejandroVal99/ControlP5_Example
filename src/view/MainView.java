package view;

import processing.core.PApplet;

public class MainView extends PApplet {
	private int screen;
	private RegisterView registerView;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.MainView");
	}
	public void settings() {
		size(500,500);
		
	}
	public void setup() {
		screen = 0;
		registerView = new RegisterView(this);
	}
	public void draw() {
		background(0);
		switch(screen) {
		case 0:
			
			registerView.drawScreen();
			
			break;
		case 1:
			
			break;
		}
		
	}
	public void mousePressed() {
		registerView.getInfoUser();
	}

}
