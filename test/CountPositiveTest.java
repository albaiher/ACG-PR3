// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1, page ??
// JUnit tests for CountPositive.java 

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails! Error humano con la comparación a 0, fault 
   // espero 2 positivos obtengo 3 porque cuento el 0 (Es positivo)
   @Test public void arrayContainsZeroes() 
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }

   // this test always succes! Prueba para observar que el fault no sale provocado por el error 
   @Test public void arrayDoesNotContainsZeroes() 
   {
      int arr[] = {-4, 2, -1, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }
}
