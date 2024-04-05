package isa2;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPersonDetails() {
        // Create a person
        Person person = new Person("Alice", 30);

        // Verify name and age using getters
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }
}


















