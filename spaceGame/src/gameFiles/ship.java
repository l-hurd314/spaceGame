package gameFiles;

public class ship {
	
	private String name;
	private int hpMax, hpCurrent, speed, movesRemaining, currentActions, maxActions, dmg;
	private int xCoord, yCoord;
	
	ship(String name){
		this.name = name;
	}
	
	int getHP(){
		return hpCurrent;
	}
	void modHP(int modAmount){
		hpCurrent += modAmount;
		//make sure hp does not go over max amount
		if(hpCurrent > hpMax){
			hpCurrent = hpMax;
		}
		//TODO function to destroy ship if hp is less than 0 (switch this to controller?)
	}
	int getMovesRemaining(){
		return movesRemaining;
	}
	void modMovesRemaining(int modAmount){
		movesRemaining += modAmount;
	}
	int getCurrentActions(){
		return currentActions;
	}
	void modCurrentActions(int modAmount){
		currentActions += modAmount;
	}
	void turnReset(){
		movesRemaining = speed;
		currentActions = maxActions;
	}
	int getDamageValue(){
		return dmg;
	}
	/************************Coordinate functions for ship*************************************/
	int getXCoord(){
		return xCoord;
	}
	void setXCoord(int newCoord){
		xCoord = newCoord;
	}
	int getYCoord(){
		return yCoord;
	}
	void setYCoord(int newCoord){
		yCoord = newCoord;
	}
	/*******************************************************************************************/
}
