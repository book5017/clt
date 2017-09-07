package com.cla.study.dp.decorator.q1;

import com.cla.study.dp.decorator.a1.Display;
import com.cla.study.dp.decorator.a1.FullBorder;
import com.cla.study.dp.decorator.a1.SideBorder;
import com.cla.study.dp.decorator.a1.StringDisplay;
import com.cla.study.dp.decorator.a1.UpDownBorder;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new UpDownBorder(b1, '-');
        Display b3 = new SideBorder(b2, '*');
        b1.show();
        b2.show();
        b3.show();
        Display b4 = 
                    new FullBorder(
                        new UpDownBorder(
                            new SideBorder(
                                new UpDownBorder(
                                    new SideBorder(
                                        new StringDisplay("�ȳ��ϼ���."),
                                        '*'
                                    ),
                                    '='
                                ),
                                '|'
                            ),
                            '/'
                        )
                    );
        b4.show();
    }
}
