
package robo;

public  class AlphaRobot extends AbstarctRobot{

	private String name;
	private String model;
	private int x;
	private int y;
	boolean moveRight;
	boolean moveLeft;
	boolean moveDown;
	boolean moveUP;
	
		// constructor for name and model 
			public AlphaRobot(String name, String model) {
				setName(name);
				setModel(model);
			}
		///ver.name & model (set/get)
			public String getName() {
				return name;
			}
				public void setName(String name) {
					if (name !=null) {
						this.name = name;
					}
				}
				
			public String getModel() {
				return name;
			}
				public void setModel(String model) {
					if (model !=null) {
						this.model = model;
					}
				}
				
				//ver.getX & getY (set/get)
				public int getX() {
					return x;
				}
					public void getX(int x) {
						if (x <=0 || x>=100) {
							System.err.println("eror");
						}
					}
					public int getY() {
						return y;
					}
						public void getY(int y) {
							if (y <=0 || y>=100) {
								System.err.println("eror");
							}
						}
					///step
							public boolean moveRight() {
								x++;
								return false;
							}
							public boolean moveLeft() {
								x--;
								return false;
							}
							public boolean moveDown() {
								y++;
								return false;
							}
							public boolean moveUP() {
								y--;
								return false;
							}
							/////
							@Override
							public String geName() {
								// TODO Auto-generated method stub
								return null;
							}
							@Override
							public void setX(int x) {
								// TODO Auto-generated method stub
								
							}
							@Override
							public void setY(int y) {
								// TODO Auto-generated method stub
								
							}
							@Override
							public void setCharge(byte Charge) {
								// TODO Auto-generated method stub
								
							}
							@Override
							public byte getCharge() {
								// TODO Auto-generated method stub
								return 0;
							}
	
	
	
	
}
