// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1, page ??
// JUnit tests for FindLast.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   // 

   @Test public void lastOccurrenceInSecondElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 3;
      assertEquals("Last occurence in first element", 1, FindLast.findLast(arr, y));
   }

   @Test public void lastOccurrenceNeverElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 6;
      assertEquals("Last occurence in first element", -1, FindLast.findLast(arr, y));
   }
   
   @Test public void lastOccurrenceInFirstElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
   }


}
