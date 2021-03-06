/**
 * The AppConfig
 */
package com.jrg.archetype.spring.simple.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import com.jrg.archetype.spring.simple.components.ComponentWithValueCharge;

/**
 * The AppConfig
 * 
 * @author Javier RG
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.jrg.archetype.spring.simple.components")
@ComponentScan("com.jrg.archetype.spring.simple.aspects")
@PropertySource("classpath:config.properties")
public class AppConfig {

    // Message source
    @Bean(name = "messageSource")
    public MessageSource messageSource() {
	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	messageSource.setBasename("classpath:messages/messages");
	messageSource.setDefaultEncoding("UTF-8");
	messageSource.setUseCodeAsDefaultMessage(true);
	return messageSource;
    }

    // ComponentWithValueCharge
    @Bean(name = "componentWithValueCharge")
    public ComponentWithValueCharge componentWithValueCharge() {
	return new ComponentWithValueCharge();
    }

}
