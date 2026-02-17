import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();

   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }


   @Test
   public void q1Test1()
   {
      InputStream originalIn = System.in;
      String data = "Helen\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("What is your name: Helen\n", bos.toString());
   }

   @Test
   public void q1Test2()
   {
      InputStream originalIn = System.in;
      String data = "Gary\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("What is your name: Gary\n", bos.toString());
   }

   @Test
   public void q2Test1()
   {
      InputStream originalIn = System.in;
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a whole number: 2\n", bos.toString());
   }

   @Test
   public void q2Test2()
   {
      InputStream originalIn = System.in;
      String data = "3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a whole number: 8\n", bos.toString());

   }

   @Test
   public void q3Test1()
   {
      InputStream originalIn = System.in;
      String data = "1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a radius: 6.28\n3.14\n", bos.toString());
   }

   @Test
   public void q3Test2()
   {
      InputStream originalIn = System.in;
      String data = "2.1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a radius: 13.188\n13.8474\n", bos.toString());
   }

   @Test
   public void q4Test1()
   {
      InputStream originalIn = System.in;
      String data = "Hello\nWorld\n0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a first name: Input a last name: Input an age: World, Hello - 0\n", bos.toString());
   }

   @Test
   public void q4Test2()
   {
      InputStream originalIn = System.in;
      String data = "Kalisz\nMr.\n99\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a first name: Input a last name: Input an age: Mr., Kalisz - 99\n", bos.toString());
   }

   @Test
   public void q5Test1()
   {
      InputStream originalIn = System.in;
      String data = "BigglesWorth\n25\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a name: Input an age: BigglesWorth28\n25\n", bos.toString());
   }

   @Test
   public void q5Test2()
   {
      InputStream originalIn = System.in;
      String data = "Sparky\n0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a name: Input an age: Sparky3\n0\n", bos.toString());
   }
   

}
