package org.springframework.boot.h2.issue;

import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:application-${spring.profiles.active}.properties")
public class Config {
}
