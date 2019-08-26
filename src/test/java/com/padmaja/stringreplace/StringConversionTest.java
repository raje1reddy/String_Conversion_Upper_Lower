package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.assertEquals;

//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class StringConversionTest {

     @Test
     public void replaceTest1() {

        StringConversion util = new StringConversion();
         //manipulateString("HelloWorld");
         String result = util.manipulateString("HelloWorld");
         //System.out.println(result);
         String expectedresult = "vbppvzvbpz";
         assertEquals(expectedresult,result);
     }
 }



