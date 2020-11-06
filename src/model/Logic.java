package model;

import java.util.ArrayList;

public class Logic {
	
	private ArrayList<UserModel> listUsers;
	private static Logic unicaInstance;

	private Logic() {
		listUsers = new ArrayList<UserModel>();
	}
	
	public static Logic getInstance() {
		if(unicaInstance == null) {
			unicaInstance = new Logic();
		}
		return unicaInstance;
	}

	public void registerNewUser(String username, String password, String email) {
		UserModel newUser = new UserModel(username, password,email);
		listUsers.add(newUser);
		
		
		/*for(UserModel userModel: listUsers) {
			System.out.println(userModel.getUsername());
			System.out.println(userModel.getPassword());
			System.out.println(userModel.getEmail());
			System.out.println(">>>>>>>>><<<<<<<<<<");
		}*/
		
		for(int i = 0; i<listUsers.size();i++) {
			System.out.println(listUsers.get(i).getUsername());
			System.out.println(listUsers.get(i).getPassword());
			System.out.println(listUsers.get(i).getEmail());
			System.out.println(">>>>>>>>><<<<<<<<<<");
		}
		
	}
	

}
