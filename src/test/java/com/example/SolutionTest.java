package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    static Solution solution;

    int n;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void ZeroIsNotAHappyNumber(){

        n = 0;

        assertFalse(solution.isHappy(n));
    }

    @Test
    public void OneIsAHappyNumber(){

        n = 1;

        assertTrue(solution.isHappy(n));
    }

    @Test
    public void TwoIsNotAHappyNumber(){

        n = 2;

        assertFalse(solution.isHappy(n));
    }

    @Test
    public void SevenIsAHappyNumber(){

        n = 7;

        assertTrue(solution.isHappy(n));
    }

    @Test
    public void NineteenIsAHappyNumber(){

        n = 19;

        assertTrue(solution.isHappy(n));
    }
}
