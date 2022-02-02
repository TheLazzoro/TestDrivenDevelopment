/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lasse Dam
 */
public class JUnitTest {

    public JUnitTest() {
    }

    @Test
    public void testNonExisting() {
        NonExisting ne = new NonExisting(); //alt+enter = context menu with create Class.
        String actual = ne.nonExistingMethod();
        assertEquals("Hello", actual);
    }

    @Test
    public void MyTest() {
        TestClass test = new TestClass();
        String hello = test.sayHello();
        assertEquals(hello, "Hello");


        String h = "Hello";
        assertEquals("Hello", h);

        assertEquals(1, 1);
        assertTrue(true);
        assertNotEquals(true, false);
    }
    
    @BeforeAll

    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
