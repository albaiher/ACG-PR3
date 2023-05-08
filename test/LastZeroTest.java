// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit tests for LastZero.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test fails!


   // this test fails!
   @Test public void noZeroes() 
   {
      int arr[] = {9, 1, 2};
      assertEquals("Multiple zeroes: should find last one", -1, LastZero.lastZero(arr));
   }

   // this test fails!
   @Test public void oneZero() 
   {
      int arr[] = {0, 1, 2};
      assertEquals("Multiple zeroes: should find last one", 0, LastZero.lastZero(arr));
   }

   @Test public void multipleZeroes() 
   {
      int arr[] = {0, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
   }
}
