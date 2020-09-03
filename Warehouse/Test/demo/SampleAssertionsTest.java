package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class SampleAssertionsTest {
    
    public SampleAssertionsTest() {
    }

  @Test
  public void testAssertArrayEquals() {
    byte[] expected = "test".getBytes();
    byte[] actual = "test".getBytes();
    assertArrayEquals(expected, actual,"failure - byte arrays not same");
  }

  @Test
  public void testAssertEquals() {
    assertEquals("text", "text", "failure - strings are not equal");
    //Checks that two primitives/objects are equal.
  }

  @Test
  public void testAssertFalse() {
    assertFalse(false, "failure - should be false");
    //Checks that a condition is false.
  }

  @Test
  public void testAssertNotNull() {
    assertNotNull( new Object(), "should not be null");
    //Checks that an object isn't null.
  }

  @Test
  public void testAssertNotSame() {
    assertNotSame(new Object(), new Object(), "should not be the same");
  }

  @Test
  public void testAssertNull() {
    assertNull(null, "should not be null");
    //Checks that an object is null.
  }

  @Test
  public void testAssertSame() {
    Integer aNumber = Integer.valueOf(62);
    assertSame(aNumber, aNumber, "should be same");
  }


  @Test
  public void testAssertTrue() {
    assertTrue(true, "failure - should be true");
    //Checks that a condition is true.
  }

}
