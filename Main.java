package demo;

import java.util.Arrays;
import java.util.Scanner; // import the Scanner class 

public class Main {
public static void main(String[] args) {

	var x = 0;
	var y = 0;
	var facing = "N";
	var minDistance = 0;
	Scanner myObj = new Scanner(System.in);
    String userCommand;
    
    System.out.println("Enter commands"); 
    userCommand = myObj.nextLine();
    
    System.out.println("User commands are: " + userCommand); 
    String[] arrOfStr = userCommand.split(","); 

//    System.out.println(Arrays.toString(arrOfStr));
    
    for (int i = 0; i < arrOfStr.length; i++) {
    	String command = arrOfStr[i].substring(0,1);       // A new string containing the specified part of the given string.
    	String movement = arrOfStr[i].substring(1);
       	
       	if (command.equals("F")) {
	       	switch (facing) {
	       	  case "N": 
	       	    y = y + Integer.parseInt(movement);
	       	    break;
	       	  case "E":
	       	    x = x + Integer.parseInt(movement);
	       	    break;
	       	  case "S":
	       	    y = y - Integer.parseInt(movement);
	       	    break;
	       	  case "W":
	       	    x = x - Integer.parseInt(movement);
	       	    break;
	       	}
       }
       	
       if (command.equals("B")){
           	switch (facing) {
         	  case "N":
         	    y = y - Integer.parseInt(movement);
         	    break;
         	  case "E":
         	    x = x - Integer.parseInt(movement);
         	    break;
         	  case "S":
         	    y = y + Integer.parseInt(movement);
         	    break;
         	  case "W":
         	    x = x + Integer.parseInt(movement);
         	    break;
         	    	    
         	}
       	}
       	if (command.equals("L")){
       		for (int j = 0; j < Integer.parseInt(movement); j++) {
           		switch (facing) {
             	  case "N":
             	    facing = "W";
             	    break;
             	  case "E":
             	    facing = "N";
             	    break;
             	  case "S":
             		facing = "E";
             	    break;
             	  case "W":
             		facing = "S";
             	    break;
             	    	    
             	}
       		}
       		}
       	
       	if (command.equals("R")){
       		for (int j = 0; j < Integer.parseInt(movement); j++) {
           		switch (facing) {
             	  case "N":
             	    facing = "E";
             	    break;
             	  case "E":
             	    facing = "S";
             	    break;
             	  case "S":
             		facing = "W";
             	    break;
             	  case "W":
             		facing = "N";
             	    break;
             	    	    
             	}
       		}
       		}

       	}
       	
//    	do your command here
//    	
//    	based on command 1, 
//    	
//    	does what to x / y and check for facing
    	

    minDistance = Math.abs(x) + Math.abs(y);
    System.out.println("Minimum amount of distance to get back to the starting point is: ");
    System.out.println(minDistance);
}
    }
    
    //remember to remove negative and only add the whole numbers


