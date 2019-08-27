package com.padmaja.stringreplace;
import java.lang.String;

// Java program for Replace every character of a
// string by a different character
public class StringConversion {

    public String ToUpperCase(String value)
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
        String str2 = String.valueOf(str);
        return  str2;
    }


}



