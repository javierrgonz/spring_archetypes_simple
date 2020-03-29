package com.jrg.archetype.spring.simple.main;

import com.jrg.archetype.spring.simple.components.ComponentWithValueCharge;
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

	    // Config log and get logger

	    // Loads component with value charge
	    ComponentWithValueCharge componentWithValueCharge = (ComponentWithValueCharge) MainUtils.getAppContext()
		    .getBean("componentWithValueCharge");

	} catch (Throwable e) {
	}
    }
}
