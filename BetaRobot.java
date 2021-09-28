  
package robo;

public class BetaRobot  extends AlphaRobot{
	public BetaRobot(String name, String model) {
		super(name,model);
	}
		private byte Charge = 0;
		
			public byte getCharge() {
				return Charge;
			}
			public void setCharge(byte Charge) {
				if(Charge>=0 || Charge<=100 )
					this.Charge = Charge;
			}
			

			

}
