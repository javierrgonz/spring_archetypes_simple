package com.jrg.archetype.spring.simple.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * The ComponentWithValueCharge
 * 
 * @author Javier RG
 */
@Component
public class ComponentWithValueCharge {

    @Getter
    @Value("${config.environment}")
    private String mssg;

}
