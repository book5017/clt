package com.cla.study.dp.solid.s;

public class Gate {

	public Gate(int lanes){
		
		
	}
	
}
class GateLane{
	
	public int isInUsed = 0;
	public String truck;
	public String container;
	
	public void readTruck(String truck){
		this.isInUsed = isInUsed | (1 << 0);
	}
	public void readContainer(String container){
		this.isInUsed = isInUsed | (1 << 1);
	}
	
	public void runGateTransaction(){
		
		if(validate()){
			
			issueGateInSlip();
		}else{
		
			issueTroubleSlip();
		}
	
		releaseTruck();
	}
	
	public boolean validate(){
		
		if(!"GoodTruck".equals(truck)){
			return false;
		}
		if(!"SoundContainer".equals(truck)){
			return false;
		}
		return true;
	}
	public void issueGateInSlip(){
		
	}
	public void issueTroubleSlip(){
		
	}
	public void releaseTruck(){
		this.isInUsed = 0;
	}
	
}