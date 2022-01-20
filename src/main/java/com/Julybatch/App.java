package com.Julybatch;

import java.util.ResourceBundle;

public class App
{
	public int userLogin(String in_user, String in_pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String password=rb.getString("password");
		
		if(in_user.equals(userName) && in_pwd.equals(password))
			return 1;
		else
			return 0;
	}
}

//This class has the method which is taking userName and password from the config.properties file which is stored under src/main/resources
//and also from AppTest class as parameters and comparing both sets. It returns the result to the AppTest class.