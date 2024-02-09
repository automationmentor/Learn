package coreJava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class UserRolesPermission {	
	
	private String Permission;
//	private Hashtable<String,String> RolePermission; // it is an array of map
	
	public void setPermission(String Permission)
	{
		this.Permission=Permission;
	}
	
	public String getPermission()
	{
	return	 Permission;
	}

//	public void setRolePermissions(Hashtable<String,String> RolePermissionObject)	
//	{		
//		this.RolePermission=RolePermissionObject;
//	}

}