package com.vt.util;

import com.vt.model.Registrationmodel;
import com.vt.sql.Registrationentity;

public class commonutils {
		
		public Registrationentity registrationmodetoentity(Registrationmodel registrationmodel, Registrationentity registrationentity) {
			
			if(registrationmodel.getEmailAddress()!=null)
				registrationentity.setEmailAddress(registrationmodel.getEmailAddress());
			if(registrationmodel.getFirstName()!=null)
				registrationentity.setFirstName(registrationmodel.getFirstName());
			if(registrationmodel.getLastName()!=null)
				registrationentity.setLastName(registrationmodel.getLastName());
			if(registrationmodel.getPassword()!=null)
				registrationentity.setPassword(registrationmodel.getPassword());
			
			
			return registrationentity;
		
	}

}
