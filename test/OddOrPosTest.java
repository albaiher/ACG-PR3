// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit tests for OddOrPos.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{

   @Test public void noOddNumbers() 
   {
      int arr[] = {8, -2, 6, 2, 4};
      assertEquals("Positive odd numbers in array", 4, OddOrPos.oddOrPos(arr));
   }

   @Test public void positiveOddNumbers() 
   {
      int arr[] = {3, -2, 6, 1, 4};
      assertEquals("Positive odd numbers in array", 4, OddOrPos.oddOrPos(arr));
   }

      // this test fails!
      @Test public void negativeOddNumbers() 
      {
         int arr[] = {-3, -2, 6, 1, 4};
         assertEquals("Negative odd numbers in array", 4, OddOrPos.oddOrPos(arr));
      }
}
