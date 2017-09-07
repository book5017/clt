package com.cla.study.dp.decorator.a2;
public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("���� ��ħ�Դϴ�.");
        md.add("�ȳ��ϼ���.");
        md.add("�ȳ��� �ֹ�����. ���� ������.");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
