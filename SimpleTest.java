
package tests;

import robo.AbstarctRobot;

public class SimpleTest {
		public static int runCase(AbstarctRobot robo) {
			int percentage = 0;
		 
		//VALUES AbstarctRobot
	  // NAME CANNOT BE NULL
			robo.setName(null);
			if(robo.getName() == null ) {
				System.err.println("Name test is filed Reson: null name not allowed!");
				return percentage;	
			}
			  percentage+=10;
			 
			 robo.setModel(null);
				if(robo.getModel() == null ) {
					System.err.println("Model test is filed Reson: null name not allowed!");
					return percentage;	
				}
				  percentage+=10;
				  
				  //coordinates
				  
				  //X CANNOT BE OUTSIDE 0 .. 100
				  robo.setX(-100);
				  	if(robo.getX() <0) {
				  		System.err.println("x coord,,, bla bla");
						return percentage;	
					}
					  percentage+=10;
					  
					  //X CANNOT BE OUTSIDE 0 .. 100
					  robo.setX(1000);
					  	if(robo.getX() >100) {
					  		System.err.println("x coord,,, bla bla");
							return percentage;	
						}
						  percentage+=10;
						  
						  //Y CANNOT BE OUTSIDE 0 .. 100
						  robo.setY(-100);
						  	if(robo.getY() <0) {
						  		System.err.println("y coord,,, bla bla");
								return percentage;	
							}
							  percentage+=10;
							  
							  //X CANNOT BE OUTSIDE 0 .. 100
							  robo.setY(1000);
							  	if(robo.getY() >100) {
							  		System.err.println("y coord,,, bla bla");
									return percentage;	
								}
								  percentage+=10;
								  
								  //MOOVEMENT
								  
								  //Y CANNOT BE OUTSIDE 0..100
									  robo.setX(0);
									  	if(robo.moveUP()) {
									  		System.err.println("Move,,, bla bla");
											return percentage;	
										}
										  percentage+=10;
										  //Y CANNOT BE OUTSIDE 0..100
										  robo.setY(100);
										  	if(robo.moveDown()) {
										  		System.err.println("Move,,, bla bla");
												return percentage;	
											}
											  percentage+=10;
											  
											//Y CANNOT BE OUTSIDE 0..100
											  robo.setX(0);
											  	if(robo.moveLeft()) {
											  		System.err.println("Move,,, bla bla");
													return percentage;	
												}
												  percentage+=10;
												  //Y CANNOT BE OUTSIDE 0..100
												  robo.setX(100);
												  	if(robo.moveRight()) {
												  		System.err.println("Move,,, bla bla");
														return percentage;	
													}
													  percentage+=10;
					  
		
						  
			return percentage;
		}
		
		
		
		
		
}


