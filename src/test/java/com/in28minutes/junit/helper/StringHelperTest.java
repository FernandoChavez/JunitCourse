package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {	
		//assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		//boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		//boolean expectedValue = false;
		//assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		//assertEquals("Dummy String", true);
		//assertFalse(true);
		//assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
