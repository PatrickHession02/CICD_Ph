package Week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
   void setup() {
    }

@Test
void testTitleMr() {
    Passenger customer = new Passenger("Mr","Patrick",20,1703021289,082298909);
    assertEquals("Mr", customer.getTitle());
}
@Test
void testTitleMrs() {
    Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 0870221);
    assertEquals("Mrs", customer.getTitle());
    }

    @Test
    void testTitleMs() {
        Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 0870221);
        assertEquals("Ms", customer.getTitle());
    }

    @Test
    void testTitleFail() {
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Ma","Patrick",20,1703021289, 0870221);});
        assertEquals("Entered invalid title.", Message.getMessage());
    }


    @Test
void testNameSuccess(){
        Passenger customer = new Passenger("Mr","Patrick",20,1703021289, 087123277);
       assertEquals("Patrick", customer.getName());
    }
    @Test
    void testNameFailure(){
        Exception Message = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr","Patrick",20,1703021289, 0870221);
        assertEquals("Entered invalid Name", Message.getMessage());
    }
    @Test
        void testIDSuccess(){
            Passenger customer = new Passenger("Mr","Patrick",20,17, 087123277);
            assertEquals(", customer.getID());
        }
    }

                    @Test
                    void testAge(){}

    @AfterEach
    void tearDown() {
    }
}