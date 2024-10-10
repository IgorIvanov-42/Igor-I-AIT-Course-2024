package classWork.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {
    ArrayTdd arrayTdd;
    int[] array = {10, -10, 20, -15, 45};

    @BeforeEach
    void setUp(){
        arrayTdd = new ArrayTdd(array);
    }
    @Test
    void countPositive(){
        int count = 3;

        int expected = arrayTdd.countPositive(array);

        assertEquals(count, expected, "Ok");

    }

}// end of class