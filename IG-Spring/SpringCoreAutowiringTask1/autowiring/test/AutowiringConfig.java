package com.ig.autowiring.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ig.autowiring.service  com.ig.autowiring.repository")
public class AutowiringConfig {

}
