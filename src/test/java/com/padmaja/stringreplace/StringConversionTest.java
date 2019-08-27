package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.assertEquals;

//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class StringConversionTest {
     @Test
     public void toUpperCase() {
         StringConversion test = new StringConversion();
         String result = test.ToUpperCase("padmaja reddy");
         String expectedresult = "PADMAJA REDDY";
         assertEquals(expectedresult ,result);

     }
 }



