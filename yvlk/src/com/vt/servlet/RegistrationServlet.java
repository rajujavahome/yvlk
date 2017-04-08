package com.vt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import com.vt.dao.AccessDao;
import com.vt.dao.AccessDaoImpl;
import com.vt.model.Registrationmodel;
import com.vt.sql.Registrationentity;
import com.vt.util.commonutils;

public class RegistrationServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		Registrationmodel registrationmodel=new Registrationmodel();
	    registrationmodel.setFirstName(req.getParameter("firstName"));
	    registrationmodel.setLastName(req.getParameter("lastname"));
	    registrationmodel.setEmailAddress(req.getParameter("emailAddress"));
		registrationmodel.setPassword(req.getParameter("password"));
		System.out.println("1");
		AccessDao dao=new AccessDaoImpl();
		Registrationentity registrationentity= new Registrationentity();
		commonutils commonutil=new commonutils();
		dao.register(commonutil.registrationmodetoentity(registrationmodel, registrationentity));
		System.out.println("inserted");		
		resp.sendRedirect("success.jsp");
		
		
		
		/*public Integer register(Registrationmodel registrationmodel, Registrationentity registrationentity) {
			
			Registrationentity = new Registrationentity();
			
			AccessDao dao=new AccessDaoImpl();	
			return customerDao.setSiteDetails(commonUtils.siteModeToEntity(sitemodel,siteDetails));	
			dao.register(registration);
			System.out.println("inserted");
	}*/
		
		
	}

	
	

}
