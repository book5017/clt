package com.cla.study.dp.solid.o;

import java.util.List;

/**
 * 
 * It is a class has common functionality for EDI processing
 * , that is to run at stated intervals to search EDI data from external system
 * , and if any found, to transmit them into TOS database.
 * 
 * It can be extended by other classes having variant features along with form of EDIs.
 */
public abstract class EDIReceiver {

	/**
	 * It should be used only in the class or child class 
	 * and should never be changed by other function or class since it's been loaded from DB in the constructor of the class
	 * 
	 */
	private String localPort;
	
	public EDIReceiver() {
		localPort = "getFromDB";
	}
	
	/**
	 * 
	 * Searching logic should vary according to the protocol of EDIs.
	 * FTP, Memory DB, File or Message Queue may be used.
	 * There is no common logic but the search process.
	 */
	abstract  List search();
	
	/**
	 * It has common logics for validation.
	 * 
	 */
	protected List validate(List list) {
		return list;
	}
	/**
	 * It has a common logic to publish the successfully processed EDI data to client applications.
	 * But there might be requirements for notification through email or SMS to clients according to sort of EDI. 
	 * External process should not access it.
	 */
	protected void notify(List list) {
		
	}
	/**
	 * 
	 * It should not be modified by other classes.
	 */
	private void insertIntoDB(List list) {
		
	}
	
	/**
	 * It runs by external threads on schedule.
	 * There are fixed four steps that shouldn't be modified.
	 */
	public void run(){
		
		List edi= search();
		
		List validData = validate(edi);
		
		insertIntoDB(validData);
		
		notify(validData);
		
	}
}
