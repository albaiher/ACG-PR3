// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1; page ??
// JUnit tests for OddOrPos.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{
   // this test fails!
   @Test public void negativeOddNumbers() 
   {
      int arr[] = {-3, -2, 6, 1, 4};
      assertEquals("Negative odd numbers in array", 4, OddOrPos.oddOrPos(arr));
   }
}
