package Week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger scanner;
    @BeforeEach
   void setup() {
     scanner = new Passenger();
    }
@Test
void testTitleMr() {
    assertEquals("Mr", scanner.Title());
}
@Test
void testTitleMrs() {
        assertEquals("Mrs", scanner.Title());
    }

    @Test
    void testTitleMs() {
        assertEquals("Ms", scanner.Title());
    }




    @Test
void testName(){
        assertEquals(" ");
    }

    @Test
    void testNumber(){}
            @Test
            void testID(){}

                    @Test
                    void testAge(){}

    @AfterEach
    void tearDown() {
    }
}