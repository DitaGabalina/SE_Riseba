package BadFormattedCode;


import java.util.Random;

public class Vehicle {
    
    // constant values 
    public static final String DEFAULT_NAME = "RacerCar";
    public static final double DEFAULT_CAPACITY = 45;
    public static final int DEFAULT_MAX_SPEED = 200;
    static Random r = new Random();

    private FuelGauge fuelGauge = new FuelGauge();
    private Odometer odometer = new Odometer();    
    
    protected String licensePlate = null;

   public void setLicensePlate(String license) {
            this.licensePlate = license;
        }
    public class FuelGauge {
	    protected double fuel;
	    public FuelGauge()
	    {
	        fuel = 0.0;
	    }
	
	    public double getFuel() 	    {	        return fuel;	    }
	
	    public void setFuel(double fuel) 	    {	        this.fuel = fuel;	    }
	
	    public void fuelUp()	    {	        if(fuel<18)	        fuel++;  
	    }
	
	    public void fuelDown()	    {	        if(fuel>0)	            fuel--;	    }

    }
    
    
    public class Odometer extends FuelGauge {

	    private int distance;
	    public void distanceUp()
	    {
	        if(distance<999999)
	            distance++;
	    }     public void distanceReset()
		    {
		        if(distance>999999)
		            distance = 0;}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
    }
        

    private String name;            
    private double tankCapacity;        
//    private double fuelLeft;            
    private int maxSpeed;
    private int locationX, locationY;
    
    public Vehicle() {
        this(DEFAULT_NAME+r.nextInt(), DEFAULT_CAPACITY*r.nextDouble(), DEFAULT_MAX_SPEED*r.nextInt());
        this.fuelGauge=new FuelGauge(); this.odometer=new Odometer(); }
    
public Vehicle(String name, double tankCapacity, int maxSpeed) {
this.name = name;
this.tankCapacity = tankCapacity;
this.maxSpeed = maxSpeed; }


public void travel(int minutes) {         for (int i=0;i<minutes;i++) {Random randomRoad = new Random();this.locationX = this.locationX+1*randomRoad.nextInt(3);this.locationY = this.locationY+1*randomRoad.nextInt(3);        }   odometer.setDistance(this.getLocationX()		+this.getLocationY()); }
    
    public String getName() {        return name;    }
    public int getLocationX() {        return locationX;   }
    public int getLocationY() {        return locationX;    }
    public String toString() {        return "Vehicle:" + name +  " ("  + locationX + ", " + locationY + "), Distance:"+ odometer.getDistance();
    }
}

