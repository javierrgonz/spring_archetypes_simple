package com.jrg.archetype.spring.simple.main;

import com.jrg.archetype.spring.simple.utils.MainUtils;

/**
 * The Main
 * 
 * @author Javier RG
 */
public class Main {

	/**
	 * The main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// Loads application context
			MainUtils.loadAppContext();

			throw new Exception();

		} catch (Throwable e) {

		}
	}
}
