package com.cla.study.dp.decorator.a1;
public abstract class Border extends Display {
    protected Display display;          
    protected Border(Display display) { 
        this.display = display;
    }
}