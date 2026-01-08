import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   

   @Test
   public void q1Test1()
   {
      String data = "Helen";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("What is your name: Helen\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q1Test2()
   {
      String data = "Gary";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("What is your name: Gary\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q2Test1()
   {
      String data = "0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a whole number: 2\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q2Test2()
   {
      String data = "3";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a whole number: 8\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q3Test1()
   {
      String data = "1";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a radius: 6.28\n3.14\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q3Test2()
   {
      String data = "2.1";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a radius: 13.188\n13.8474\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q4Test1()
   {
      String data = "Hello\nWorld\n0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a first name: Input a last name: Input an age: World, Hello - 0\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q4Test2()
   {
      String data = "Kalisz\nMr.\n99";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a first name: Input a last name: Input an age: Mr, Kalisz - 99\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q5Test1()
   {
      String data = "BigglesWorth\n25";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a name: Input an age: BigglesWorth28\n25\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void q5Test2()
   {
      String data = "Sparky\n0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a name: Input an age: Sparky3\n0\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }
   

}
