package com.cla.study.dp.solid.i.bad;

import com.cla.study.dp.solid.i.Container;

public interface IMachine {

	void move(Container cntr);
	
	void pick(Container cntr);
	
	void stack(Container cntr);
	
}
