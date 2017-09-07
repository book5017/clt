package com.cla.study.dp.decorator.q2;

import com.cla.study.dp.decorator.a2.Display;
import com.cla.study.dp.decorator.a2.FullBorder;
import com.cla.study.dp.decorator.a2.MultiStringDisplay;
import com.cla.study.dp.decorator.a2.SideBorder;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good morning");
        md.add("Hello");
        md.add("See you again!");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
