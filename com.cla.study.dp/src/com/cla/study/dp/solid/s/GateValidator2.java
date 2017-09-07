package com.cla.study.dp.solid.s;

/**
 * 
 * @author Jake
 *
 */
public class GateValidator2 {

	
	public Message validate(Container cntr){
		Message msg = new Message();
		
		
		validateER01(cntr, msg);
		validateER02(cntr, msg);
		validateER03(cntr, msg);
		
		return msg;
	}
	private void validateER01(Container cntr, Message msg){
		if(!"A".equals(cntr.property1)){
			msg.isSucceeded = false;
			msg.code = "ER01";
			msg.message.append("Property1 is not A");
		}
	}
	private void validateER02(Container cntr, Message msg){
		if(!"B".equals(cntr.property2)){
			msg.isSucceeded = false;
			msg.code = "ER02";
			msg.message.append("Property2 is not B");
		}
	}
	private void validateER03(Container cntr, Message msg){
		if(!"C".equals(cntr.property3)){
			msg.isSucceeded = false;
			msg.code = "ER03";
			msg.message.append("Property3 is not C");
		}
	}
	
	class Message{
		public boolean isSucceeded = true;
		public String code = null;
		public StringBuilder message = new StringBuilder();
	}
	class Container{
		public String cntrNo;
		public String property1;
		public String property2;
		public String property3;
	}
}
