package com.example.greetingcard

import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup(){
        assertEquals(calculateTip(10.0, 20), 2.0, 0.01)
    }

}