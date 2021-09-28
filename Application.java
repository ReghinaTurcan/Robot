Aplication 
package main;

import robo.AlphaRobot;
import robo.BetaRobot;
import tests.ChargeTest;
import tests.SimpleTest;

public class Aplication {

	public static void main(String[] args) {
		// AbstractRobot testRobot = new AbstractRobot();
		System.out.printf("Simple bla bla \n ", SimpleTest.runCase(new AlphaRobot("Robo", "alpha")));
		System.out.printf("Simple bla bla  \n", SimpleTest.runCase(new BetaRobot("Robo", "Beta")));
		System.out.printf("Charge bla bla  \n", ChargeTest.runCase(new ChargeTest()));

	}

}
