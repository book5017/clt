package com.cla.study.dp.decorator.a2;
public class StringDisplay extends Display {
    private String string;                         
    public StringDisplay(String string) {          
        this.string = string;
    }
    public int getColumns() {                      
        return string.getBytes().length;
    }
    public int getRows() {                         
        return 1;
    }
    public String getRowText(int row) {            
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
