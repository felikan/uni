package bicycle;

public class Bicycle {
	
	int cadence;
	int speed;
	int gear;
	
	void changeCadence(int newValue){
		this.cadence = newValue;
	}
	
	void changeGear(int newValue) {
		this.gear = newValue;
	}
	
	void speedUp(int increment) {
		this.speed = this.speed + increment;
	}
	
	void applybreaks(int decrement) {
		this.speed = this.speed - decrement;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 
		return super.toString() + " Candence: "+ this.cadence + " Gear: " + this.gear + " Speed" + this.speed;
	}
}
