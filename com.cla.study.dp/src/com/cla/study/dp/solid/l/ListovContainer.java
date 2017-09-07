package com.cla.study.dp.solid.l;

public class ListovContainer {
	

	public static void main(String[] args) {

		
		TankContainer tankCntr = new TankContainer();
		
		double grossWgt1 = tankCntr.getGrossWeight();
		
		Container cntr = (Container) tankCntr;
		
		double grossWgt2 = cntr.getGrossWeight();
		
		if(grossWgt1 == grossWgt2) {
			// true
		}

		
	}
	

}
class Equipment{

	protected double tareWeight;
	
	public double getGrossWeight() {
		return tareWeight;
	}
}

class Chassis extends Equipment{
	
	
}
class Container extends Equipment{
	
	protected double cargoWeight;

	@Override
	public double getGrossWeight() {
		return super.tareWeight + this.cargoWeight;
	}
}
class TankContainer extends Container{
	
	private double airpressure;
	
	private double temperature;
	
//	@Override
//	public double getGrossWeight() {
//		return super.tareWeight + super.cargoWeight * getWgtCoefficient();
//	}
	
	public double getGrossWeightConsideringAirPressure() {
		return super.tareWeight + super.cargoWeight * getWgtCoefficient();
	}
	public double getGrossWeight(double airpressure) {
		return super.getGrossWeight() * airpressure;
	}
	private double getWgtCoefficient() {
		
		return airpressure * temperature * 0.131413154141514;
	}
}