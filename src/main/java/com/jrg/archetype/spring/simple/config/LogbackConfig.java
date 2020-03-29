/**
 * The LogbackConfig
 */
package com.jrg.archetype.spring.simple.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jrg.archetype.spring.simple.constants.ConfigConstants;
import com.jrg.archetype.spring.simple.utils.MainUtils;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.ext.spring.ApplicationContextHolder;

/**
 * The LogbackConfig
 * 
 * @author Javier RG
 *
 */
@Configuration
@PropertySource("classpath:config.properties")
public class LogbackConfig {

    @Bean
    public static ApplicationContextHolder applicationContextHolder() {
	return new ApplicationContextHolder();
    }

    @Bean
    public static LoggerContext loggerContext() {
	return (LoggerContext) LoggerFactory.getILoggerFactory();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public static PatternLayoutEncoder encoder(LoggerContext ctx) {
	PatternLayoutEncoder encoder = new PatternLayoutEncoder();
	encoder.setContext(ctx);
	encoder.setPattern(MainUtils.getProperty(ConfigConstants.LOG_PATTERN));
	return encoder;
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public static ConsoleAppender consoleAppender(LoggerContext ctx, PatternLayoutEncoder encoder) {
	ConsoleAppender appender = new ConsoleAppender();
	appender.setContext(ctx);
	appender.setEncoder(encoder);
	return appender;
    }
}