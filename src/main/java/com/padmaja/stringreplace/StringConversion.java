package com.padmaja.stringreplace;
import java.lang.String;

// Java program for Replace every character of a
// string by a different character
public class StringConversion {

    //Function to manipulate the string
    public String manipulateString(String str)
    {

        char[] str1 = str.toCharArray();

        // looping through each character of string
        for (int i = 0; i < str.length(); i++) {

            // storing integer ASCII value of
            // the character in 'asc'

            int asc = str1[i];

            // 'rem' contains coded value which
            // needs to be rounded to 26
            int rem = asc - (26 - (str1[i] - 97));

            // coverting 'rem' character in range
            // 0-25 and storing in 'm'
            int m = rem % 26;

            // printing character by adding ascii value of 'a'
            // so that it becomes in the desired range i.e. a-z
            str1[i] = (char)(m + 'a');





                }


       /* for (int i = 0; i < str.length(); ++i)
        {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
               //String str2[i] = ++[str.charAt(i) - 'A'];
            }
        }*/
        String str2 = String.valueOf(str1);
        ToUpperCase(str2);
        //System.out.println(str2.toUpperCase());

        //System.out.println(str2);
        return str2;

    }

    public void ToUpperCase(String value)
    {
        char str[]=value.toCharArray();
        System.out.println(str.length);
        for(int i=0;i<str.length;i++)
        {
            if(str[i]>='a' && str[i]<='z')
            {
                str[i]=(char)((int)str[i]-32);
            }
        }
        System.out.println("The string in UpperCase is");
        for(int i=0;i<str.length;i++)
            System.out.print(str[i]);
    }

}



