package com.I18N.scjp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Java03
 */
public class Java03 {

    public static void main(String[] args) {
        System.out.println(DateFormat.getDateInstance(0,Locale.US).format(new Date()));

        System.out.println(DateFormat.getDateInstance(1,Locale.US).format(new Date()));

        System.out.println(DateFormat.getDateTimeInstance(2,1,Locale.US).format(new Date()));

        System.out.println(DateFormat.getDateInstance(3,Locale.US).format(new Date()));

        System.out.println(DateFormat.getDateInstance(0,Locale.UK).format(new Date()));

        System.out.println(DateFormat.getDateInstance(0,Locale.US).format(new Date()));

        System.out.println(DateFormat.getDateInstance(0,Locale.ITALY).format(new Date()));


        /*
        o/p
        Wednesday, April 13, 2022
        April 13, 2022
        Apr 13, 2022
        4/13/22

        Wednesday, 13 April 2022
        Wednesday, April 13, 2022
        mercoledì 13 aprile 2022
        */
        /*
        NumberFormat and DateFormat.

        Setting maximum and minimum integer and fraction digit.

        NumberFormat class defines the following methods for this purpose.

        public void setMaximumFractionDigits(int n);

        public void setMinimumFractionDigits(int n);

        public void setMaximumIntegerDigits(int n);

        public void setMinimumIntegerDigits(int n)
        ;

        NumberFormat nf=NomberFormat.getInstance();

        case01:
        nf.setMaximumFractionDigits(2);
        SOP(nf.format(123.4567));123.4567
        SOP(nf.format(123.4));123.4

        case02:
        nf.setMinimumFractionDigits(2);
        SOP(nf.format(123.4567));123.4567
        SOP(nf.format(123.4));123.40

        case03:
        nf.setMaximumIntegerDigits(3);
        SOP(nf.format(123456.789));456.789
        SOP(nf.format(1.2345));1.2345

        case04:
        nf.setMinimumIntegerDigits(3);
        SOP(nf.format(123456.789));123,456.789
        SOP(nf.format(1.2345));001.2345



        DateFormat.

        Various location follow various styles to represent Date.
        IN: DD-MM-YYYY
        US: MM-DD-YYYY

        we can use DateFormat to format java date according to a particular Locale.

        DateFormat class present in java.text package and it is an abstract class.

        DateFormat df=new DateFormat();
        Invalid. because it is abstract class.

        Getting DateFormat object for default Locale.

        public static DateFormat getInstance();

        public static DateFormat getDateInstance();

        public static DateFormat getDateInstance(int style);

        The allowed styles are 0 to 3.

        DateFormat.FULL-->0  
        DateFormat.LONG-->1
        DateFormat.MEDIUM-->2
        DateFormat.SHORT-->3

        The defauly style is medium.

        Getting DateFormat Object for specific Locale.

        public static DateFormat getDateInstance(int style,Locale l);

        Once we got DateFormat Object,we can call the following method on that object.

        public String format(Date d);
        To convert java Date form to locale specific String form.

        public Date parse(String s) throws ParseExcpetion;
        to convert Locale specific String form to java Date form.

        WAP to display current system date in all possible style in USA form.

        WAP to display current system date in UK,US and italy styles.


        Getting DataFormat Object for both date and time.

        DateFormat class defines the following methods.

        public static DateFormat getDateTimeInstance();

        public static DateFormat getDateTimeInstance(int dateStyle,int timeStyle);

        public static DateFormat getDateTimeInstance(int dateStyle,int timeStyle,Locale l);

        The allowed style for time also :0 to 3.

        eg.
        refer code
        */
    }
}