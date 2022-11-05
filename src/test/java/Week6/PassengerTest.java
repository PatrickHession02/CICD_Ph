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
    Passenger customer = new Passenger("Mr","Patrick",20,909090292921, 087123277);
    assertEquals("Mr", customer.getTitle());
}
@Test
void testTitleMrs() {
    Passenger customer = new Passenger("Mr","Patrick",20,909090292921, 087123277);
    assertEquals("Mrs", customer.getTitle());
    }

    @Test
    void testTitleMs() {
        Passenger customer = new Passenger("Mr","Patrick",20,909090292921, 087123277);
        assertEquals("Ms", customer.getTitle());
    }

    @Test
    void testTitleFail() {
        Passenger customer = new Passenger("Ma","Patrick",20,909090292921, 087123277);
        assertEquals("Entered invalid title.", exMessage.getMessage());
    }


    @Test
void testNameSuccess(){
        Passenger customer = new Passenger("Mr","Patrick",20,909090292921, 087123277)
       assertEquals("Patrick", customer.getName());
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