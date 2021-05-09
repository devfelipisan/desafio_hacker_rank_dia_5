package desafio_hacker_rank_dia_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import desafio_hacker_rank_dia_5.Loop.Calculator;

/**
 * 
 * @author Felipi Santana
 * @since 08/05/2021
 * 
 */

class LoopTest {
    final private Calculator newCalculator = new Calculator(2);
    Random generator = new Random();

    @Test
    @DisplayName("Creating Object Calculator")
    void createCalculator() {
        assertTrue(newCalculator instanceof Calculator);
    }

    @Test
    @DisplayName("Method Getter Setter")
    void test_method_setter_getter(){
        assertAll("TestLoop",
            () -> {
                for (int i=0; i < 50 ; i++){
                    int number = generator.nextInt(9);
                    newCalculator.setNumber(number);
                    assertEquals(number, newCalculator.getNumber());
                }
            }
        );
    }

    @Test
    @DisplayName("Method toString")
    void test_method_toString(){
        assertTrue(newCalculator.toString().getClass().getName() instanceof String);
    }
}
