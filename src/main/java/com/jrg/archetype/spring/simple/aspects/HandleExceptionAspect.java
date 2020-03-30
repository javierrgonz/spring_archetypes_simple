/**
 * The LoggingAspect
 */
package com.jrg.archetype.spring.simple.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.tinylog.Logger;

/**
 * The LoggingAspect
 * 
 * @author Javier RG
 *
 */
@Aspect
@Component
public class HandleExceptionAspect {

	/**
	 * Manejador de excepciones
	 * 
	 * @param ex
	 */
	@AfterThrowing(pointcut = "execution(* com.jrg.archetype.spring.simple.*.*.*(..))", throwing = "ex")
	public void logExceptionCause(Throwable ex) {
		if (Logger.isDebugEnabled()) {
			Logger.debug(ex.getCause());
		}
		if (Logger.isErrorEnabled()) {
			Logger.error(ex.getCause());
		}

	}
}
