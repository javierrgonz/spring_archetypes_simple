package com.jrg.archetype.spring.simple.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class ComponentWithValueCharge {

    @Value("${msg.hello}")
    @Getter
    private String mssg;

}
