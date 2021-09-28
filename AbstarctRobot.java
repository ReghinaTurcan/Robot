
package robo;

public abstract class AbstarctRobot {

	// Robot schema 
	public abstract void setName(String name);
	public abstract String geName();
	
	
	public abstract void setModel(String model);
	public abstract String getModel();
	
	public abstract void setX(int x);
	public abstract int getX();
	
	public abstract void setY(int y);
	public abstract int getY ();
	
	public abstract void setCharge(byte Charge);
	public abstract byte getCharge ();
	
	public abstract boolean moveRight();
	public abstract boolean moveLeft();
	public abstract boolean moveDown();
	public abstract boolean moveUP();
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object setCharge() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCharge(Object object) {
		// TODO Auto-generated method stub
		
	}
}
	
	
