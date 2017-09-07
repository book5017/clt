package com.cla.study.dp.solid.d.edi.good;

import com.cla.study.dp.solid.d.edi.TosModel;

abstract public class GoodEdiAction {
	
	private IBookingHandler handler = new Edi301Handler();
	
	public void receiveBooking(){
		
		IEdiBooking booking = handler.importBooking();
		
		TosModel tosModel  = convert(booking);
		
		saveBookingIntoDB(tosModel);
		
	}
	abstract protected TosModel convert(IEdiBooking booking);
	
	abstract protected void saveBookingIntoDB(TosModel model);

}

interface IEdiBooking{
	
	String getBkgNo();
	String getCntrNo();
	
}
interface IBookingHandler{
	
	IEdiBooking importBooking();
	
	void exportBooking(TosModel model);
}

class Edi301Handler implements IBookingHandler{

	@Override
	public IEdiBooking importBooking() {
		
		return null;
	}

	@Override
	public void exportBooking(TosModel model) {
		
	}
}

class CorpanHandler implements IBookingHandler{
	@Override
	public IEdiBooking importBooking() {
		
		return null;
	}

	@Override
	public void exportBooking(TosModel model) {
		
	}
}