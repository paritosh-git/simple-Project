package com.junit;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArraylistEx1Test {

	ArraylistEx1 alex = new ArraylistEx1();

	static ArrayList<Integer> alfinal = new ArrayList<Integer>();

	@BeforeClass
	public static void alnewdata() {
		alfinal.add(2);
		alfinal.add(1);
		alfinal.add(3);
		alfinal.add(1);
	}

	@Test
	public void alldatatest() {
		Assert.assertEquals(alfinal, ArraylistEx1.addData());
	}
}
