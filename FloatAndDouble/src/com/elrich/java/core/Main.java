package com.elrich.java.core;

public class Main {

	public static void main(String[] args) {
		
		float myMinfloatValue = Float.MIN_VALUE;
		float myMaxfloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinfloatValue);
		System.out.println("Float maximum value = " + myMaxfloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);
		
		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d / 3d;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);
		
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilograms =  " + convertedKilograms);
		
		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);
		
	}
}
