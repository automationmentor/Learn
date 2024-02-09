package coreJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Configuration;
import org.testng.annotations.Factory;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.NoInjection;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.TestInstance;

public class DataProviderClass {
 
 
 @Test (dataProvider="getData")    
 public void loginTest(String Uid, String Pwd){
 System.out.println("UserName is "+ Uid);
 System.out.println("Password is "+ Pwd);
 System.out.println("Run Complete");
 }
 

 @DataProvider(name="getData",parallel=true)
 public String[][] getData(){
 String [][] data = {{"FirstUid","FirstPWD"},{"SecondUid","SecondPWD"}};
 return data; 
 }
}