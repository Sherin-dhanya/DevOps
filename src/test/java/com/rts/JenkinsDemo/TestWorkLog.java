package com.rts.JenkinsDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWorkLog {

	WorkLog w1=new WorkLog();
	
	@Test
	public void testAddLog1() {
		assertEquals("Added Log for Dhanya",w1.addToLog("Dhanya"));
	}
	
	@Test
	public void testAddLog2() {
		assertEquals("Added Log for Sherin",w1.addToLog("Sherin"));
	}
	@Test
	public void testAddLogins1() {
		assertEquals("Added Login Log for Dhanu",w1.addLogins("Dhanu"));
	}
	@Test
	public void testAddLogins2() {
		assertEquals("Added Login Log for Ammu",w1.addLogins("Ammu"));
	}
}
