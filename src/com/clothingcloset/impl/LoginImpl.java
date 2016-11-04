package com.clothingcloset.impl;

import com.clothingcloset.api.Login;
import com.clothingcloset.handlers.LoginHandler;
import com.clothingcloset.models.UserLogin;

public class LoginImpl implements Login {

	// Declarations
	LoginHandler loginHandler = new LoginHandler();

	@Override
	public boolean validateUser(final UserLogin userLogin) {
		return false;
	}

	@Override
	public boolean registerUser(final UserLogin userLogin) {
		return loginHandler.registerUser(userLogin.getUserName(), userLogin.getPassword(), userLogin.getId(),
				userLogin.getUserType());
	}

}
