package com.clothingcloset.testclient;

import com.clothingcloset.api.Login;
import com.clothingcloset.impl.LoginImpl;
import com.clothingcloset.models.UserLogin;

public class TestClient {

	public static void main(String[] args) {

		UserLogin userLogin = new UserLogin();
		userLogin.setId(1);
		userLogin.setUserName("Saurav");
		userLogin.setPassword("abcdef");
		userLogin.setUserType("Donar");
		
		LoginImpl loginImpl = new LoginImpl();
		boolean isUserRegistered = loginImpl.registerUser(userLogin);
		if(isUserRegistered){
			System.out.println("SUCCESS!!");
		}else{
			System.out.println("FAILURE");
			
		}

	}

}
