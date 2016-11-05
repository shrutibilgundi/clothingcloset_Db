package com.clothingcloset.api;

import com.clothingcloset.models.PBLStaff;
import com.clothingcloset.models.Person;
import com.clothingcloset.models.UserLogin;

public interface Login {

	public boolean registerPerson(Person person);

	public boolean validateUser(UserLogin userLogin);
	
	public boolean validatePBLStaff(PBLStaff pblStaff);

}
