package coreJava;
import java.util.*;

public class userProfile {
	private int id;
	private String Name;
	private String UserName;
	private String Password;
	private ArrayList<UserRoles> UserRoles;
	
	public userProfile()
	{
		
	}
	

	// Setters
	
	public void setRole(ArrayList<UserRoles> UserRolesObject)
	{		
	this.UserRoles=UserRolesObject;
	}
	
	public void setID(int ID)
	{
	this.id=ID;	
	}
	
	public void setName(String name)
	{
		this.Name=name;
	}
	
	public void setUserName(String username)
	{
		this.UserName=username;
	}
	
	public void setPassword(String password)
	{
		this.Password=password;
	}
	
	// Getters
	
	public String getRole()
	{
		return UserRoles.toString();
	}
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getUserName()
	{
		return UserName;
	}
	
	public String getPassword()
	{
		return Password;
	}
	
}