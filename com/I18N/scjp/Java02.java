package com.I18N.scjp;

import java.text.NumberFormat;
import java.util.Locale;

public class Java02 {
    public static void main(String[] args) {
        // Locale l=Locale.getDefault();
        // System.out.println(l.getCountry()+"----"+l.getLanguage());
        // System.out.println(l.getDisplayCountry()+"---"+l.getDisplayLanguage());
        // Locale l1=new Locale("pa","IN");
        // Locale.setDefault(l1);
        // System.out.println(Locale.getDefault().getDisplayLanguage());

        // for (String s: Locale.getISOCountries()) {
        //     System.out.println(s);
        // }
        // for (String s: Locale.getISOLanguages()) {
        //     System.out.println(s);
        // }
        // for (Locale s: Locale.getAvailableLocales()) {
        //     System.out.println(s.getDisplayCountry()+"---"+s.getDisplayLanguage());
        // }

        System.out.println(NumberFormat.getInstance(Locale.ITALY).format(123456.789));
        //123.456,789

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(123456.789));


        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(123456.789));


        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(123456.789));
       // 123.456,789
        //$123,456.79
        //£123,456.79
        //Rs.123,456.79
        /*
        I18N

        Locale class

        A locale object represents a geographic locations(Country)or language or both.

        We can create an locale object to represent india.

        We can create an locale object to represent English Language.

        Locale class present in java.util package.
        It is a final class and it is a direct child class of Object.        It implements serializable and cloneable interfaces.

        How to create an Locale object.

        Constructor.

        1,
        Locale l=new Locale(String language);

        2,
        Locale l=new Locale(String language,String country);

        Locale l=new Locale("pa","IN");
        pa:- panjabi
        IN:- India.

        Locale class already define some constant to represent some standard Locales.
        We can use this constant directly.

        Locale.US;
        Locale.UK;
        Locale.ITALY;
        Locale.CANADA;


        Important methods of Locale class.

        public static Locale getDefault();

        public static void setDefault(Locale l);

        public String getCountry(); US

        public String getLanguage(); en

        public String getDisplayCountry();
        United States

        public String getDisplayLanguage(); English

        public static String[] getISOLanguage();

        public static String[] getISOCountries();

        public static Locale[] getAvailableLocales();

        refer code...

        NumberFormat.

        Various location follow various styles to represent a java number.
        eg.
        Double d=123456.789;

        IN:1,23,456.789
        US:123,456.789
        Italy:123.456,789

        We can use NumberFormat Class to format a Java number according to particular Locale.

        NumberFormat class present in java.text package and it is a abstract class.
        
        NumberFormat nf =new NumberFormat(); Invalid.

        Getting NumberFormat object for the default Locale.

        NumberFormat class defines the following methods for this purpose.

        public static NumberFormat getInstance();
        
        public static NumberFormat getCurrencyInstance();

        public static NumberFormat getPercentInstance();

        public static NumberFormat getNumberInstance();


        Getting NumberFormat object for specific Locale.

        The above methods are same but we have to pass the corresponding locale Object as argument.


        public static NumberFormat getInstance(Locale l);
        
        public static NumberFormat getCurrencyInstance(Locale l);

        public static NumberFormat getPercentInstance(Locale l);

        public static NumberFormat getNumberInstance(Locale l);



        Once we got NumberFormat Object, we can call format and parse() on that Object.

        public string format(long l);
        public string format(double d);
        to convert java number form to locale specific String form.

        public Number parse(String s)throws ParseException;
        To convert locale specific String form to java Number form.

        Java Number --> Locale specific --> format()

        locale specific string-->Java Number --> parse()

        WAP to display a java number in itely specific form.

        WAP to display a java number in UK,US AND INDIA currency form.










        */
    }
}
