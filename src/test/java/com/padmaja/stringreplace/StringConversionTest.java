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

     @Test
     public void replaceTest2() {

         StringConversion util = new StringConversion();
         //manipulateString("HelloWorld");
         String result = util.manipulateString("PADmajaReddy");
         System.out.println(result);
         String expectedresult = "LHNRTLTPBZZPlhnrtltpbzzp";
         assertEquals(expectedresult,result);
     }

     @Test
     public void replaceTest3() {

         StringConversion util = new StringConversion();
         //manipulateString("HelloWorld");
         String result = util.manipulateString("P!$£$£$%^%&%^&*&()()(_+{}OUITYUTYTERTRU Reddy");
         System.out.println(result);
        // String expectedresult = "LHVHVHJNJLJNLTLPRPRPPVTXJVXTDVTDTPPTPVZPBZZPl\HvHvHJnJLJnLTLPRPRPpVtxjvxtdvtdtpptpvZpbzzp";
        // assertEquals(expectedresult,result);
     }





     @Test
     public void toUpperCase() {
         StringConversion test = new StringConversion();
         String result = test.ToUpperCase("padmaja reddy");
         String expectedresult = "PADMAJA REDDY";
         assertEquals(expectedresult ,result);

     }

     @Test
     public void toUpperCaseTest() {
         StringConversion test = new StringConversion();
         String result = test.ToUpperCase("rajendra reddy");
         String expectedresult = "RAJENDRA REDDY";
         assertEquals(expectedresult ,result);
     }
     @Test
     public void toUpperCaseTest1() {
         StringConversion test = new StringConversion();
         String result = test.ToUpperCase("abcdefghijklmnopqrstuvwxyz");
         String expectedresult = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         assertEquals(expectedresult ,result);
     }

 }



