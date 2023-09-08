package lab1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    double epsilon = 1e-6;

    @Test
    public void testFormulaWithPositiveInputs() {
        int x = 3;
        int y = 4;
        Task1 t = new Task1();
        double result = t.formula(x, y);
        double expected = 3.2887156490680556; // Replace with the expected result
        double epsilon = 1e-6; // A small tolerance for floating-point comparisons
        assertEquals(expected, result, epsilon);
    }

    @Test
    void formulaPositiveAndNegativeInputs() {
        int x = 1;
        int y = -1;
        Task1 t = new Task1();
        double result = t.formula(x, y);
        assertEquals(result, 3.0/2, epsilon);
    }

    @Test
    public void testFormulaWithNegativeX() {
        int x = -3;
        int y = 4;
        Task1 t = new Task1();
        double result = t.formula(x, y);
        double expected = -2.6555345679420475;
        assertEquals(expected, result, epsilon);
    }
}