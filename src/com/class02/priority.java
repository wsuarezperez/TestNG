package com.class02;

import org.testng.annotations.Test;

public class priority {
@Test 
public void first() {
	System.out.println("first annotation");
}

@Test (priority = 1) //assigning the priority
public void second() {
	System.out.println("second annotation");
}

@Test (priority = 2)
public void third() {
	System.out.println("third annotation");
}

@Test (priority = 3)
public void fourth() {
	System.out.println("fourth annotation");
}

@Test (priority = 4)
public void fifth() {
	System.out.println("fifth annotation");
}
}
