package com.cla.study.dp.solid.d.edi.bad;

import com.cla.study.dp.solid.d.edi.EDI301;
import com.cla.study.dp.solid.d.edi.TosModel;

abstract public class BadEdiAction {
	
	
	private Edi301Handler handler = new Edi301Handler();
	
	public void receiveBooking(){
		EDI301 booking = handler.importBooking();
		
		TosModel tosModel = convert(booking);
		
		saveBookingIntoDB(tosModel);
	}
	
	abstract protected TosModel convert(EDI301 booking);
	
	abstract protected void saveBookingIntoDB(TosModel model);
	
}
class Edi301Handler{
	
	public EDI301 importBooking(){
		
		EDI301 edi301 = new EDI301();
		
		return edi301;
		
	}
}
