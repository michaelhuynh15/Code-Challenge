package demo;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {

	var x = 0;
	var y = 0;
	var facing = "N";
	var minDistance = 0;
	
	String str = "F1,R1,B2,L1,B3"; 
    String[] arrOfStr = str.split(","); 

    System.out.println(Arrays.toString(arrOfStr));
    
    for (int i = 0; i < arrOfStr.length; i++) {
//    	System.out.println(arrOfStr[i]);
//    	
    	String[] command = arrOfStr[i].split(""); 
//       	System.out.println(command[1]);
       	
       	if (command[0].equals("F")) {
	       	switch (facing) {
	       	  case "N": 
	       	    y = y + Integer.parseInt(command[1]);
	       	    break;
	       	  case "E":
	       	    x = x + Integer.parseInt(command[1]);
	       	    break;
	       	  case "S":
	       	    y = y - Integer.parseInt(command[1]);
	       	    break;
	       	  case "W":
	       	    x = x - Integer.parseInt(command[1]);
	       	    break;
	       	}
       }
       	
       if (command[0].equals("B")){
           	switch (facing) {
         	  case "N":
         	    y = y - Integer.parseInt(command[1]);
         	    break;
         	  case "E":
         	    x = x - Integer.parseInt(command[1]);
         	    break;
         	  case "S":
         	    y = y + Integer.parseInt(command[1]);
         	    break;
         	  case "W":
         	    x = x + Integer.parseInt(command[1]);
         	    break;
         	    	    
         	}
       	}
       	if (command[0].equals("L")){
       		for (int j = 0; j < Integer.parseInt(command[1]); j++) {
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
       	
       	if (command[0].equals("R")){
       		for (int j = 0; j < Integer.parseInt(command[1]); j++) {
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
    System.out.println(minDistance);
}
    }
    
    //remember to remove negative and only add the whole numbers


