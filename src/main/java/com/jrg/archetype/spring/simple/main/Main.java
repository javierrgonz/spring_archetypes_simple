package com.jrg.archetype.spring.simple.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jrg.archetype.spring.simple.components.ComponentWithValueCharge;
import com.jrg.archetype.spring.simple.constants.MessageConstants;
import com.jrg.archetype.spring.simple.utils.MainUtils;
import com.jrg.archetype.spring.simple.utils.MessageUtils;

/**
 * The Main
 * 
 * @author Javier RG
 */
public class Main {

    // Gets the logger
    private static Logger logger = LogManager.getLogger();

    /**
     * The main method
     * 
     * @param args
     */
    public static void main(String[] args) {

	// Loads application context
	MainUtils.loadAppContext();

	// Log start
	logger.debug(MessageUtils.getMessage(MessageConstants.APP_START_MSG));

	// Loads component with value charge
	ComponentWithValueCharge componentWithValueCharge = (ComponentWithValueCharge) MainUtils.getAppContext()
		.getBean("componentWithValueCharge");

    }
}
