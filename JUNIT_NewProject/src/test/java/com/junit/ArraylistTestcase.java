package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraylistTestcase {

	 
	@Test
    public void testMyArray() {
		ArraylistTest at = new ArraylistTest();
        assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), at.myArray());
        System.out.println("Arraylist created");
    }
}

