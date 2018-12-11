/* You define that you want a class to use an interface
 * with the implements keyword. This class must create
 * a method for each method defined in Drivable
 * You can implement more than 1 interface like this
 * public class Vehicle implements Drivable, Crashable
 */
// You make a class part of an abstract class by using 
//the extends keyword
public class vehicle extends crashable implements drivable {
	
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	// All methods must be as visible as those in the 
	// interface. If they are public in the interface
	// they must be public in the subclass
	public int getWheels(){
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}
	
	public vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public void setCarStrength(int carStrength){
		this.carStrength = carStrength;
	}
	
	public int getCarStrength(){
		return this.carStrength;
	}
	
}