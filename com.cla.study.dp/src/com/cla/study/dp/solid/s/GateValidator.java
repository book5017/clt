package com.cla.study.dp.solid.s;

/**
 * 
 * @author Jake
 *
 */
public class GateValidator {

	
	public Message validate(Container cntr){
		Message msg = new Message();
		
		if(!"A".equals(cntr.property1)){
			msg.isSucceeded = false;
			msg.message.append("Property1 is not A");
		}
		if(!"B".equals(cntr.property2)){
			msg.isSucceeded = false;
			msg.message.append("Property2 is not B");
		}
		if(!"C".equals(cntr.property3)){
			msg.isSucceeded = false;
			msg.message.append("Property3 is not C");
		}
		return msg;
	}
	
	class Message{
		public boolean isSucceeded = true;
		public StringBuilder message = new StringBuilder();
	}
	class Container{
		public String cntrNo;
		public String property1;
		public String property2;
		public String property3;
	}
}
