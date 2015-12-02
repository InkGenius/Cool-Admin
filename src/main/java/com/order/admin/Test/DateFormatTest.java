package com.order.admin.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/2
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */
public class DateFormatTest {

    public void getTimeByDate(){
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();//���ڸ�ʽ����ȷ����
        System.out.println(df1.format(date));
        DateFormat df2 = DateFormat.getDateTimeInstance();//���Ծ�ȷ��ʱ����
        System.out.println(df2.format(date));
        DateFormat df3 = DateFormat.getTimeInstance();//ֻ��ʾ��ʱ����
        System.out.println(df3.format(date));
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL); //��ʾ���ڣ��ܣ������磬ʱ�䣨��ȷ���룩
        System.out.println(df4.format(date));
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG); //��ʾ����,�����磬ʱ�䣨��ȷ���룩
        System.out.println(df5.format(date));
        DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT); //��ʾ���ڣ�������,ʱ�䣨��ȷ���֣�
        System.out.println(df6.format(date));
        DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM); //��ʾ���ڣ�ʱ�䣨��ȷ���֣�
        System.out.println(df7.format(date));
    }

    public void getTimeByCalendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//��ȡ���
        int month=cal.get(Calendar.MONTH);//��ȡ�·�
        int day=cal.get(Calendar.DATE);//��ȡ��
        int hour=cal.get(Calendar.HOUR);//Сʱ
        int minute=cal.get(Calendar.MINUTE);//��
        int second=cal.get(Calendar.SECOND);//��
        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);//һ�ܵĵڼ���
        System.out.println("���ڵ�ʱ���ǣ���Ԫ"+year+"��"+month+"��"+day+"��      "+hour+"ʱ"+minute+"��"+second+"��       ����"+WeekOfYear);
    }
    public static void main(String[] args) {
        DateFormatTest t = new DateFormatTest();
        t.getTimeByDate();
        System.out.println("****************************");
        t.getTimeByCalendar();
    }
}
