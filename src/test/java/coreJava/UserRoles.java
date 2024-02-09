package coreJava;
import java.util.*;

public class UserRoles {
	
	private String Role;
	private ArrayList<Map> RolePermissions; // 
	
	public void setRole()
	{
		Role="Admin";		
	}
	
	public String getRole()
	{
		return Role;
	}
	
	public void setRolePermissions(ArrayList<Map> RolePermissionsObject)
	{
		this.RolePermissions=RolePermissionsObject;
	}
	
//	public String getRolePermissions()
//	{
//		return 
//	}
	

}