package com.clothingcloset.impl;

import org.springframework.stereotype.Component;

import com.clothingcloset.api.Login;
import com.clothingcloset.handlers.LoginHandler;
import com.clothingcloset.models.PBLStaff;
import com.clothingcloset.models.Person;
import com.clothingcloset.models.UserLogin;

@Component
public class LoginImpl implements Login {

	// Declarations
	LoginHandler loginHandler = new LoginHandler();

	@Override
	public boolean registerPerson(Person person) {
		loginHandler.registerPerson(person);
		return false;
	}

	@Override
	public boolean validateUser(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatePBLStaff(PBLStaff pblStaff) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
