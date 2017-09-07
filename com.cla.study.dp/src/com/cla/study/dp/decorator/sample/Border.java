package com.cla.study.dp.decorator.sample;
public abstract class Border extends Display {
    protected Display display;          
    protected Border(Display display) { 
        this.display = display;
    }
}
