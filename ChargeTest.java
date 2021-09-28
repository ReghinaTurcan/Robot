///ChargeTest 
package tests;

import robo.AbstarctRobot;

public class ChargeTest {
		
		public static byte runCase(ChargeTest chargeTest) {
			byte test = 0;

			chargeTest.setCharge((byte) 20);
			if(chargeTest.setCharge() > 10 ) {
				System.err.println("g");
				return test;		 
			}
	return test=+1;
		}

		private byte setCharge() {
			// TODO Auto-generated method stub
			return 0;
		}

		private void setCharge( byte i) {
			// TODO Auto-generated method stub
			
		}
}
