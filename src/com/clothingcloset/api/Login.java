package com.clothingcloset.api;

import com.clothingcloset.models.UserLogin;

public interface Login {

	public boolean registerUser(UserLogin userLogin);

	public boolean validateUser(UserLogin userLogin);

}
